create table files
(
    id   serial primary key,
    name varchar not null,
    path varchar not null unique
);

comment on table files is 'Таблица с данными файлов';
comment on column files.id is 'Идентификатор';
comment on column files.name is 'Имя файла';
comment on column files.path is 'Путь к файлу';