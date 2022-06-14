package com.example.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tns.entities.Student;
@ComponentScan
@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class SpringStarterProjectApplication {

	


	public static void main(String[] args) {
		//SpringApplication.run(SpringStarterProjectApplication.class, args);
		//int a=55;
		//System.out.println(a);
		//Student s=new Student();
		//ConfigurableApplicationContext org.springframework.boot.SpringApplication.run(Class<?> primarySource, String... args);
		ConfigurableApplicationContext a=SpringApplication.run(SpringStarterProjectApplication.class, args);
		//Student s=a.getBean(Student.class);
		Student s=new Student();
		s.display();
	}

}
