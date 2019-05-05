package com.only.mbplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.only")
@SpringBootApplication
@ServletComponentScan
public class MbplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbplusApplication.class, args);
	}

}
