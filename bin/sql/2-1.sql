CREATE TABLE IF NOT EXISTS TEAM(
    TEAM_ID MEDIUMINT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL
);
DELETE FROM TEAM;
INSERT INTO TEAM(NAME) VALUE('Manchester FC');
INSERT INTO TEAM(NAME) VALUE('London FC');
INSERT INTO TEAM(NAME) VALUE('Liverpool FC');
INSERT INTO TEAM(NAME) VALUE('Blackburn FC');
INSERT INTO TEAM(NAME) VALUE('Leeds FC');
INSERT INTO TEAM(NAME) VALUE('Ipswich FC');
INSERT INTO TEAM(NAME) VALUE('Bolton FC');
COMMIT;