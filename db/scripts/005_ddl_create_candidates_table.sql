create table candidates
(
    id            serial primary key,
    name          varchar not null,
    description   varchar not null,
    creation_date timestamp,
    visible       boolean not null,
    city_id       int references cities(id),
    file_id       int references files(id)
);

comment on table candidates is 'Таблица с вакансиями';
comment on column candidates.id is 'Идентификатор';
comment on column candidates.name is 'Название';
comment on column candidates.description is 'Описание';
comment on column candidates.creation_date is 'Дата создания';
comment on column candidates.visible is 'Видимость резюме';
comment on column candidates.city_id is 'Город';
comment on column candidates.file_id is 'Файл';