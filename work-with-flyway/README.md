# step 1: 引入flyway
    <dependency>
	    <groupId>org.flywaydb</groupId>
	    <artifactId>flyway-core</artifactId>
	</dependency>

如果是使用mysql需引入mysql驱动

    <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
	</dependency>
# step 2:配置数据源
    spring.datasource.url=jdbc:mysql://localhost:3306/spring_boot_demo?
    spring.datasource.username=root
    spring.datasource.password=123456
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver

# step 3:配置flyway

    spring.flyway.baseline-on-migrate=true
    spring.flyway.enabled=true
    spring.flyway.locations=classpath:db/migration/{vendor},filesystem:/opt/migration/{vendor}

其中 spring.flyway.location
classpath:db/migration/{vendor} 会在class文件中查找sql脚本文件，
filesystem:/opt/migration/{vendor} 会在指定的文件系统查找sql脚本文件；
其中vendor为数据库供应商的名称，即数据库类型，如mysql,flyway会根据数据库确定数据库类型，会在相应目录下查找;

# step 4:编写脚本
脚本文件命名方式
V\[版本号\]__\[表名\].sql

以大写V开头，跟着版本号，接着是两个下划线，然后跟着表名，以.sql给文件扩展名
例如 V1__student.sql

脚本文件中的内容为一般的SQL语句

# step 5:运行程序
运行Application.java，flyway会检测脚本文件并执行；

详细的使用请查阅官方文档

在配置文件application.properties中添加：


# 注意
如果按照 Flyway 官方文档 的指导，仅配置 Flyway，应用启动时并不会执行 Flyway 的任何操作，这是因为 FlywayAutoConfiguration 类在启动时要求有 DataSource 的实例，如果没有配置，就不会执行 Flyway，所以在依赖里添加了 MyBatis(或 JPA) ，使用 MyBatis(或 JPA) 时会自动注入数据源，因此才会执行 Flyway，具体可以参考https://github.com/spring-projects/spring-boot/issues/8649 和 https://stackoverflow.com/questions/43496506/how-to-debug-when-flyway-doesnt-work-on-spring-boot

如果是多个数据源，则需要在 Flyway 进行操作的数据源 Bean 上添加 @FlywayDataSource注解或者在 application.properties 里添加 spring.flyway.[url,user,password]进行配置