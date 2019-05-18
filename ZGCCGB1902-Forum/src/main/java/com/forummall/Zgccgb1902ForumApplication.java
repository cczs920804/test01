package com.forummall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.forummall.**.dao")
@SpringBootApplication
public class Zgccgb1902ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(Zgccgb1902ForumApplication.class, args);
	}

}
