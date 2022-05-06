create table `comment`
(
    id bigint auto_increment primary key not null,
    type int,
    gmt_create bigint,
    gmt_modified bigint,
    parent_id bigint,
    commentator bigint,
    like_count bigint default 0,
    content varchar(1024),
    comment_count int default 0,
);