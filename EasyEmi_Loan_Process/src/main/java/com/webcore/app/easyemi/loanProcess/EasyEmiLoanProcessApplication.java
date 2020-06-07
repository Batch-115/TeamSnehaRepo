package com.webcore.app.easyemi.loanProcess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class EasyEmiLoanProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyEmiLoanProcessApplication.class, args);
		
		System.out.println("hi loan process");
	}

}
