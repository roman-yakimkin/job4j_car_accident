drop table if exists authorities;
drop table if exists users;

create table authorities (
    id              serial  primary key,
    authority       varchar(50) not null unique
);

create table users (
    id              serial primary key,
    username        varchar(50) not null unique,
    password        varchar(200) not null,
    enabled         boolean default true,
    authority_id    int not null references authorities(id)
);

insert into authorities (authority) values ('ROLE_ADMIN');
insert into authorities (authority) values ('ROLE_USER');

insert into users   (username, password, authority_id)
values ('root', '$2a$10$cvFKBQ6Xwo4.7MLJyJPyuOuPL3SA5QFXbVygx1XmwOT0KBlZvUW9W',
        (select id from authorities where authority = 'ROLE_ADMIN'));

