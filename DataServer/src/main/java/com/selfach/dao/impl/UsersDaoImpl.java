package com.selfach.dao.impl;

import com.selfach.dao.UsersDao;
import com.selfach.dao.jooq.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

import static com.selfach.dao.jooq.tables.User.USER;

/**
 * By gekoreed on 9/12/15.
 */
@Repository
public class UsersDaoImpl implements UsersDao {

    @Autowired
    DSLContext context;

    @Override
    public List<UserRecord> getAllUsers() {
        return context.selectFrom(USER).fetchInto(UserRecord.class);
    }

    @Override
    public int registerNewUser(UserRecord userRecord) {
        return context.insertInto(USER)
                .set(userRecord)
                .returning(USER.ID)
                .fetchOne().getId();
    }

    @Override
    public Optional<UserRecord> userExists(String email) {
        return Optional.ofNullable(context.selectFrom(USER)
                .where(USER.EMAIL.eq(email))
                .fetchOneInto(UserRecord.class));
    }

    @Override
    public UserRecord getUserByLoginAndPwd(String email, String password) {
        return context.selectFrom(USER)
                .where(USER.EMAIL.eq(email)
                        .and(USER.PASSWORDHASH.eq(password)))
                .fetchOne();
    }

    @Override
    public UserRecord getUserById(int userId) {
        return  context.selectFrom(USER)
                .where(USER.ID.eq(userId))
                .fetchOne();
    }

    @Override
    public void save(UserRecord user) {
        context.insertInto(USER)
                .set(user)
                .execute();
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        context = DSL.using(dataSource, SQLDialect.MYSQL);
    }

    @Override
    public void deleteUser(int id) {
        context.deleteFrom(USER).where(USER.ID.eq(id)).execute();
    }

    @Override
    public void update(UserRecord user) {
        context.update(USER)
                .set(user).where(USER.ID.eq(user.getId()))
                .execute();
    }

    @Override
    public void updateLang(int userId, String lang) {
        context.update(USER).set(USER.LANG, lang)
                .where(USER.ID.eq(userId))
                .execute();
    }

    @Override
    public String getLang(int userId) {
        return context.select(USER.LANG).from(USER)
                .where(USER.ID.eq(userId))
                .fetchOneInto(String.class);
    }


}
