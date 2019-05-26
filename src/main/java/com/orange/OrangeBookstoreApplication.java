package com.orange;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.orange.dao.mapper.*")
public class OrangeBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeBookstoreApplication.class, args);
	}

}
