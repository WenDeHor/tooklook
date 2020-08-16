
-- drop table user;
drop sequence if exists global_seq;
CREATE SEQUENCE if not exists global_seq START WITH 10;


-- INSERT INTO users ( userId , userName, userEmail, userPassword)
-- VALUES (1002, 'Володимир Сергійович', 'xalivan@ukr.net', 'password'),
--        (1003, 'Юлія Олегівна', 'xalivan@ukr.net', 'password');

INSERT INTO usr (id, username, password, active)
VALUES (10, '1', '1', true),
       (11, '2', '2', true);
