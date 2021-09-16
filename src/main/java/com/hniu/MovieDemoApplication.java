package com.hniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hniu.dao")
public class MovieDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDemoApplication.class, args);
	}

}
