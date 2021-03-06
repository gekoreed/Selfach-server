DROP TABLE IF EXISTS CameraRaiting;
DROP TABLE IF EXISTS Photo;
DROP TABLE IF EXISTS User;
DROP TABLE IF EXISTS Camera;

CREATE TABLE User(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(22) DEFAULT 'none',
    surname VARCHAR(22) DEFAULT 'none',
    passwordHash VARCHAR(44),
    email VARCHAR(22),
    created TIMESTAMP DEFAULT '2015-01-01 00:00:00' NOT NULL,
    modified TIMESTAMP DEFAULT '2015-01-01 00:00:00' NOT NULL
)DEFAULT CHARACTER SET = utf8;



CREATE TABLE CameraGroup(
    id INT(11) PRIMARY KEY NOT NULL,
    name VARCHAR(55)
)DEFAULT CHARACTER SET = utf8;

CREATE TABLE Camera(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(22) DEFAULT 'none',
    url VARCHAR(55) NOT NULL,
    longitude VARCHAR(22) NOT NULL,
    latitude VARCHAR(22) NOT NULL,
    vector VARCHAR(22) NOT NULL DEFAULT '0,0',
    angle INT(11) DEFAULT -1,
    working INT DEFAULT 1,
    description VARCHAR(55),
    cameraGroup INT(11),
    FOREIGN KEY (cameraGroup) REFERENCES CameraGroup (id) ON DELETE CASCADE

)DEFAULT CHARACTER SET = utf8;

create TABLE CameraRating (
    id int(11) AUTO_INCREMENT not null,
    cameraId int(11) not null,
    userId int(11) not null default '0',
    raiting int(11) default '0',
    PRIMARY KEY (id),
    FOREIGN KEY (cameraId) REFERENCES Camera (id),
    FOREIGN KEY (userId) REFERENCES User (id)
);

CREATE TABLE Photo(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    userId INT(22) NOT NULL,
    format VARCHAR(22) NOT NULL,
    created VARCHAR(22) NOT NULL,
    cameraId INT (22),
    FOREIGN KEY (userId) REFERENCES User (id) ON DELETE CASCADE,
    FOREIGN KEY (cameraId) REFERENCES Camera (id) ON DELETE CASCADE
)DEFAULT CHARACTER SET = utf8;

INSERT INTO User(id, name, surname, passwordHash, email, created, modified)
         VALUES (1, 'Evgen', 'Shevchenko', 'gdsksadvasndva', 'gekoreed@gmail.com', 20150929120000, 20150929120000);
INSERT INTO Camera(id, name, url, longitude, latitude, vector, description) VALUES (1, 'Головна площа КПІ', 'http://stream.kpi.ua:8101/stream.flv', '30.456353', '50.449214', '50.449367,30.457687', 'some camera description'),
    (2, 'Алея конструкторів', 'http://stream.kpi.ua:8102/stream.flv', '30.458881', '50.449139', '50.449265,30.459540', 'some camera description'),
    (3, 'Памятник Патону', 'http://stream.kpi.ua:8105/stream.flv', '30.460531', '50.448845', '50.449108,30.460625', 'some camera description'),
    (4, 'Музейна площа', 'http://stream.kpi.ua:8104/stream.flv', '30.460951', '50.448710', '50.448551,30.461527', 'some camera description'),
    (5, 'На головному корпусі', 'http://stream.kpi.ua:8106/stream.flv', '30.460660', '50.449637', '50.450050,30.461059', 'some camera description');
INSERT INTO CameraRating (cameraId, raiting, userId) VALUES (1, 4, 1), (1, 3, 1), (1, 5, 1), (1, 5, 1);