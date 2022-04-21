CREATE DATABASE ilern;
create table action
(
    id   SERIAL primary key,
    name varchar not null
);

create table resource
(
    id   SERIAL primary key,
    name varchar not null
);

create table permission
(
    id          SERIAL primary key,
    name        varchar not null,
    action_id   int references action (id),
    resource_id int references resource (id)
);

create table role
(
    id   SERIAL primary key,
    name varchar not null
);
create table role_permission_mapping
(
    id            SERIAL primary key,
    role_id       int references role (id),
    permission_id int references permission (id)
);