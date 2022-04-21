## 小胡社区

## 资料
[Spring 文档](https://spring.io/guides)
[elastic 中文社区](https://elasticsearch.cn/explore)
[Github OAuth](https://docs.github.com/en/developers/apps/building-oauth-apps)
[Flyway](https://flywaydb.org/documentation/getstarted/firststeps/maven)
[lombok](https://projectlombok.org/)
[thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#difference-between-thinsert-and-threplace-and-thinclude)
[jquery](https://jquery.com/download/)
[Markdown 插件](https://pandao.github.io/editor.md/)
[UFile SDK](https://github.com/ucloud/ufile-sdk-java)
[图标素材库](https://www.iconfont.cn/)
## 工具
[Github](https://github.com/)
[Visual Paradigm](https://www.visual-paradigm.com/cn/)
[OkHttp](https://square.github.io/okhttp/)
[flyway](https://flywaydb.org/documentation/getstarted/firststeps/maven)
[lombok](https://projectlombok.org/setup/maven)
## 脚本
```sql
0create table USER
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
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```