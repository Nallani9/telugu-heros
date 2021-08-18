#SpringBoot Project Plsql

create table alluarjun (
    id  serial not null constraint alluarjun_pkey primary key,
    movie_name    varchar(255)  NOT NULL,
    released_year varchar(255)  NOT NULL,
    role_name     varchar(255),
    heroin_name   varchar(255),
    critic        varchar(255)

);

GRANT ALL PRIVILEGES ON TABLE alluarjun TO test;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO test;
select * from alluarjun;
DELETE FROM alluarjun WHERE id = 3;
ALTER SEQUENCE alluarjun_id_seq RESTART;
ALTER SEQUENCE sequence RESTART WITH 1;

create table jrntr(
    id serial not null constraint jrntr_pkey primary key,
    movie_name    varchar(255),
    released_year varchar(255),
    role_name     varchar(255),
    heroin_name   varchar(255),
    critic        varchar(255)

);

GRANT ALL PRIVILEGES ON TABLE jrntr TO test;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO test;
select * from jrntr;
ALTER SEQUENCE jrntr_id_seq RESTART;


create table mahesh(
                      id serial not null constraint mahesh_pkey primary key,
                      movie_name    varchar(255),
                      released_year varchar(255),
                      role_name     varchar(255),
                      heroin_name   varchar(255),
                      critic        varchar(255)
);

GRANT ALL PRIVILEGES ON TABLE mahesh TO test;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO test;
select * from mahesh;
ALTER SEQUENCE mahesh_id_seq RESTART;
