package com.pokupaka;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.pokupaka.processor.handlers.GeneralHandler;
import com.pokupaka.processor.handlers.Response;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.util.CharsetUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.Map;

import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LENGTH;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_TYPE;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * By gekoreed on 9/12/15.
 */
@Component
@ChannelHandler.Sharable
public class MsgResolver extends SimpleChannelInboundHandler<HttpContent> {
    String APPLICATION_JSON = "application/json; charset=UTF-8";

    final ObjectMapper mapper = new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    Map<String, GeneralHandler> beansOfType;

    @Autowired
    ApplicationContext context;

    @PostConstruct
    public void preConstruct(){
        beansOfType = context.getBeansOfType(GeneralHandler.class);
    }


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpContent msg) throws Exception {

        ByteBuf buf = msg.content();
        String requestContent = buf.toString(CharsetUtil.UTF_8);
        ObjectNode requestNode = (ObjectNode) mapper.readTree(requestContent);
        if (!requestNode.has("cmd")) {
            writeAnswer(ctx, "not a command");
            return;
        }

        String cmd = requestNode.get("cmd").asText();

        GeneralHandler handler = beansOfType.get(cmd);

        Response response = handler.handle(requestNode);
        JsonNode node = mapper.valueToTree(response);

        writeAnswer(ctx, node);
    }

    private void writeAnswer(ChannelHandlerContext ctx, JsonNode jsonNode) {
        writeAnswer(ctx, jsonNode.toString());
    }

    private void writeAnswer(ChannelHandlerContext ctx, String answer) {
        ByteBuf respContent = ctx.alloc().buffer();
        respContent.writeBytes(answer.getBytes(Charset.forName("UTF-8")));

        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, respContent);
        response.headers().set(CONTENT_TYPE, APPLICATION_JSON);
        response.headers().set(CONTENT_LENGTH, respContent.readableBytes());
        ctx.writeAndFlush(response);
    }
}
