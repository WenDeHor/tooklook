DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS usr;
DROP TABLE IF EXISTS message;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 100;

CREATE TABLE usr
(
    id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    username VARCHAR                          NOT NULL,
    password VARCHAR                          NOT NULL,
    active   BOOL                DEFAULT TRUE NOT NULL
);

CREATE TABLE message
(
    id      INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    user_id INTEGER NOT NULL,
    text    VARCHAR NOT NULL,
    tag     VARCHAR NOT NULL,
    FOREIGN KEY (user_id) REFERENCES usr (id) ON DELETE CASCADE

);
-- CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

CREATE TABLE user_role
(
    user_id INTEGER NOT NULL,
    roles   VARCHAR,
    CONSTRAINT user_roles_idx UNIQUE (user_id, roles),
    FOREIGN KEY (user_id) REFERENCES usr (id) ON DELETE CASCADE
);

