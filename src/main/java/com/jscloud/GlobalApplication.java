package com.jscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tk.mybatis.spring.annotation.MapperScan;

@ComponentScan("com.jscloud")
@MapperScan(basePackages = {"com.jscloud.*.dao"})
@EnableAspectJAutoProxy
@SpringBootApplication
public class GlobalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalApplication.class, args);
	}

}
