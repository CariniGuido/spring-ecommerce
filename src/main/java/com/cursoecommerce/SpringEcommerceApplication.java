package com.cursoecommerce;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


import org.springframework.boot.SpringApplication;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerceApplication.class, args);
	}

}
