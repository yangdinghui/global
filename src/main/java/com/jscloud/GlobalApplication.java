package com.jscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.jscloud")
@EnableAspectJAutoProxy
@SpringBootApplication
public class GlobalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalApplication.class, args);
	}

}
