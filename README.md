## 小胡社区

## 资料
[Spring 文档](https://spring.io/guides)
[elastic 中文社区](https://elasticsearch.cn/explore)
[Github OAuth](https://docs.github.com/en/developers/apps/building-oauth-apps)
## 工具
[Github](https://github.com/)
[Visual Paradigm](https://www.visual-paradigm.com/cn/)
[OkHttp](https://square.github.io/okhttp/)
## 脚本
```sql
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

```