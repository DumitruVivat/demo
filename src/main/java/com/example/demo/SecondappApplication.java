package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// For scanning no default packages
//		(
//		scanBasePackages = {"com.example.demo",
//		"com.example.util"}
//)
public class SecondappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondappApplication.class, args);
	}

}
