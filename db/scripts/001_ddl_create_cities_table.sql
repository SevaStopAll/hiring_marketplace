create table cities
(
    id   serial primary key,
    name varchar not null unique
);

comment on table cities is 'Таблица с городами';
comment on column cities.id is 'Идентификатор';
comment on column cities.name is 'Название';