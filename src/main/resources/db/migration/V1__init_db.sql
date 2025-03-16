create table usr (
    id bigint not null,
    active boolean,
    email varchar(255),
    name varchar(255),
    password varchar(255),
    surname varchar(255),
    username varchar(255),
    primary key (id)
);