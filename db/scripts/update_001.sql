drop table if exists accident;

create table accident (
    id          serial primary key,
    name        varchar(2000) not null,
    text        text,
    address     varchar(2000)
);

insert into accident (name, text, address) values
    ('First accident', 'Description of the first accident', 'Address of the first accident'),
    ('Second accident', 'Description of the second accident', 'Address of the second accident'),
    ('Third accident', 'Description of the third accident', 'Address of the third accident'),
    ('Fourth accident', 'Description of the fourth accident', 'Address of the fourth accident'),
    ('Fifth accident', 'Description of the fifth accident', 'Address of the fifth accident');