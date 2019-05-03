# SpringBoot与Maven依赖

在我们这个模块中，直接在IDE中直接点击Application的main方法就可以运行了。

然后我们访问http://localhost:8080/ 就可以看到运行结果了。

然后通过pom文件可以看到，我们这个模块没有直接依赖任何dependencies都可以
直接运行，因为它集成了父模块的依赖，所以可以。

依旧我们所有的demo都写成maven多模块的格式。
