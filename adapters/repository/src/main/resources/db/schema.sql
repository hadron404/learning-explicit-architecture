drop table if exists trial.t_user;
create table trial.t_user
(
    `id`     int primary key auto_increment,
    `name`   varchar(255) not null,
    `age`    int          not null,
    `gender` int          not null
);
