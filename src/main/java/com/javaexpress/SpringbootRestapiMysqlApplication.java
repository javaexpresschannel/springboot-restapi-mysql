package com.javaexpress;

import java.util.Date;

import javax.persistence.PrePersist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestapiMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiMysqlApplication.class, args);
	}
	
	@PrePersist
	public void displayTime() {
		System.out.println("Today Date is "+new Date());
	}

}
