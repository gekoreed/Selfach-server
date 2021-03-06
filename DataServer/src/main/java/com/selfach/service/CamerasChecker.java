package com.selfach.service;

import com.selfach.dao.CamerasDao;
import com.selfach.dao.jooq.tables.records.CameraRecord;
import com.selfach.enums.Resolution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * By gekoreed on 11/24/15.
 */
@Component
public class CamerasChecker {

    @Autowired
    CamerasDao camerasDao;

    @Autowired
    SnapShotter snapShotter;

    @Scheduled(fixedDelay = 180 * 60 * 1000)
    public void checkCameras() throws Exception {
        List<CameraRecord> unavailableCameras = camerasDao.getUnavailableCameras();
        int id = 0;
        for (CameraRecord camera : unavailableCameras) {
            boolean working = snapShotter.makeImage(id + "-20151001000000-", camera.getUrl(), Resolution.COMPRESSED, -1);
            if (working){
                camerasDao.setCameraWorking(camera);
            }
            id++;
        }
    }
}
