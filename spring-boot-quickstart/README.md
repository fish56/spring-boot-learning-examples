# SpringBoot与Maven依赖

在我们这个模块中，直接在IDE中直接点击Application的main方法就可以运行了。

然后我们访问http://localhost:8080/ 就可以看到运行结果了。

然后通过pom文件可以看到，我们这个模块没有直接依赖任何dependencies都可以
直接运行，因为它继承了父模块的依赖，所以可以自身不再需要引入依赖。

以后我们所有的demo都写成maven多模块的格式。

然后我们在在src/test文件夹下编写了几个测试用例，也是可以正常使用
的，这部分是Spring的基础知识点，这里不再赘述。


SpringBoot的基础依赖有
- spring-boot-starter-web
  这部分包含了Spring全家桶以及Tomcat作为容器
  
- spring-boot-starter-test
  测试相关
  
- spring-boot-devtools
  可以让我们的程序启动的更加的快。。。
