package com.shopping.Inventory.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.shopping")
@EnableJpaRepositories(basePackages = "com.shopping.Inventory.repository")
@EntityScan(basePackages = "com.shopping.Inventory.model")
public class InventoryApplication{
	
		public static void main(String[] args) {
			SpringApplication.run( InventoryApplication.class, args );
		}

	}

