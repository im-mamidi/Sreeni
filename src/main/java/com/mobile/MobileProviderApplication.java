package com.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mobile.contorller","com.mobile.servicesImp"})
public class MobileProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileProviderApplication.class, args);
	}

}
