create table user
(
    id bigint auto_increment primary key not null,
    account_id varchar(100),
    name varchar(100),
    token char(36),
    gmt_creat bigint,
    gmt_modified bigint,
    bio varchar(256),
    avatar_url varchar(100),
);