create database todo;

use todo;

create table todo(
id serial not null primary key,
task_name varchar(500),
task_description text,
created_at timestamp default now(),
completed boolean default FALSE
);