insert into users (username, password, enabled) values
    ('admin', '123456', true),
    ('user', '123456', true);

insert into authorities (username, authority) values
    ('admin', 'ROLE_USER'),
    ('admin', 'ROLE_ADMIN'),
    ('user', 'ROLE_USER');