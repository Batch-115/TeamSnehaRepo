package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;

@Repository
public interface CustomerDetails_Repository extends JpaRepository<CustomerDetails, Integer> {

	
	
}
