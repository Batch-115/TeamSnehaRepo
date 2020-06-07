package com.webcore.app.easyemi.loanProcess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

//@EnableEurekaClient
@CrossOrigin("*")
@EnableJpaRepositories
@EntityScan
@EnableAutoConfiguration
@SpringBootApplication
public class ApprovalLetterLoanProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprovalLetterLoanProcessApplication.class, args);
	}

}
