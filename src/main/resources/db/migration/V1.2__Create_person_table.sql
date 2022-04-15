create table USER
(
    ID           INT auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);
create table comment
(
    id BIGINT auto_increment,
    parent_id BIGINT not null,
    type int not null,
    commentator int not null,
    gmt_create BIGINT not null,
    gmt_modified BIGINT not null,
    like_count int default 0,
    constraint COMMENT_PK
        primary key (id)
);