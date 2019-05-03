# 配置文件
SpringBoot默认的配置文件是application.yml
或者是application.properties.

然后配置文件中的配置大致有两种：
- 类似于：`spring.application.name=spring-boot-configuration`
  配置之后覆盖了默认的属性
  
- 另一种就是自定义属性了，配置之后自己读取自己用

### 如何读取配置？
我们可以直接在一个类上标注
```java
@ConfigurationProperties(prefix = "my.config")
```
这样它在生成bean的时候就会把配置文件中的my.config.* 的值
按照属性名映射到这个类的实例的对应的属性上

或者我们直接在属性上标注
```java
@Value("${my.secret}")
```
SpringBoot就会读取配置文件的对应信息，反射到我们的实例属性上。

### 如何证明我们装配成功了？
你可以运行Application的main函数，然后在浏览器中访问，
看看@Autowired是否生效

或者直接运行测试用例

### 随机数
为了方便使用，SpringBoot允许在配置文件中使用随机数
```yml
my.secret=${random.value}
# 一个数字+英文字母的随机字符串

my.number=${random.int}
# 随机int型

my.bignumber=${random.long}
my.uuid=${random.uuid}
my.number.less.than.ten=${random.int(10)}

my.number.in.range=${random.int[10,100]}
# 在一定范围内的随机数
```

### 多环境配置
SpringBoot允许我们为不同的环境写不同的配置

如果我们在Application.properties中配置了
```yml
spring.profiles.active=dev
```
那么SpringBoot在运行时还会读取application-dev.properties中
的数据

### @ConfigurationProperties
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
        </dependency>
```

上面的依赖和注解类似于lombok，我们的属性注入
是IDE（IDEA等）帮我们自动补全的，不是SpringBoot帮我们做的