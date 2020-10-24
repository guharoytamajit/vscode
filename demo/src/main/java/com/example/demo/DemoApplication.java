package com.example.demo;

import com.example.entity.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(2);
		System.out.println(emp.getId());
		emp.setId(3);	
		SpringApplication.run(DemoApplication.class, args[0]);
	}

}
