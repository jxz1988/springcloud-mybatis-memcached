package com.jxz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.jxz.mapper")
public class DemoMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisApplication.class, args);
	}
}
