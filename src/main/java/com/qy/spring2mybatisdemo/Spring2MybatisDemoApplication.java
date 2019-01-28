package com.qy.spring2mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.qy.dao")
public class Spring2MybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2MybatisDemoApplication.class, args);
	}

}

