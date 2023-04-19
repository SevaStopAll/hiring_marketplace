create table vacancies
(
    id            serial primary key,
    title         varchar not null,
    description   varchar not null,
    creation_date timestamp,
    visible       boolean not null,
    city_id       int references cities(id),
    file_id       int references files(id)
);

comment on table vacancies is 'Таблица с вакансиями';
comment on column vacancies.id is 'Идентификатор';
comment on column vacancies.title is 'Название';
comment on column vacancies.description is 'Описание';
comment on column vacancies.creation_date is 'Дата создания';
comment on column vacancies.visible is 'Видимость вакансии';
comment on column vacancies.city_id is 'Город';
comment on column vacancies.file_id is 'Файл';