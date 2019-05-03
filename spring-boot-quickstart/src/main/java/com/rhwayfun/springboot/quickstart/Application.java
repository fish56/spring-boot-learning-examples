package com.rhwayfun.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动类
//   SpringBoot内置了tomcat容器，所以打包后可以直接运行，减少运维的麻烦
//   自动扫描当前包下的bean，达到自动装配
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
