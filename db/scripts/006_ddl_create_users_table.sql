CREATE TABLE users
(
    id       SERIAL PRIMARY KEY,
    email    varchar unique not null,
    name     varchar        not null,
    password varchar        not null
);

comment on table users is 'Таблица пользователей';
comment on column users.id is 'Идентификатор';
comment on column users.email is 'Почта пользователя';
comment on column users.name is 'Имя пользователя';
comment on column users.password is 'Пароль пользователя';