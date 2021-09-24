-- create database

CREATE TABLE jaegers(
    id serial PRIMARY KEY,
    modelName  text,
    mark      text,
    height    real,
    weight    integer,
    status    text,
    origin    text,
    launch    date,
    kaijuKill integer
);