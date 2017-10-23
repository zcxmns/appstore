package com.yztx.appstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.yztx.appstore")
@SpringBootApplication
@EnableSwagger2
@CrossOrigin
public class AppstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppstoreApplication.class, args);
	}
}
