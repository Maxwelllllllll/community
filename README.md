## 小胡社区

##部署
###依赖
-Git  下载代码 \
-JDK  编译 \
-Maven  构建项目 \
-MySQL  数据库
##步骤
-pwd 查看当前目录 \
-ps -aux | grep java 查看当前进程 \
-yum update\
-yum install git 安装git\
-mkdir app 创建app文件夹\
-cd app\
-git clone https://github.com/Maxwelllllllll/community.git \
-yum install maven 安装maven \
-mvn -v 查看maven版本 \
-mvn clean compile package \
-more src/main/resources/application.properties \
-cp src/main/resources/application.properties src/main/resources/application-production.properties\
-vim src/main/resources/application-production.properties \
-mvn package \
-java -jar -Dspring.profiles.active=production target/community-0.0.1-SNAPSHOT.jar 运行命令

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
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```