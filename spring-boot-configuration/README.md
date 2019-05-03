# 配置文件
默认的配置文件是application.yml或者是application.properties

我们可以直接在一个类上标注
```java
@ConfigurationProperties(prefix = "my.config")
```
这样它在生成bean的时候就会把配置文件中的my.config.* 的值
按照属性名映射到对应的属性上

或者我们直接在属性上标注
```java
@Value("${my.secret}")
```
类读取配置文件的信息