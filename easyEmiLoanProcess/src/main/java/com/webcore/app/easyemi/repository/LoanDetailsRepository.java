package com.webcore.app.easyemi.repository;

import org.springframework.data.repository.CrudRepository;

import com.webcore.app.easyemi.model.CustomerLoanDetails;

public interface LoanDetailsRepository extends CrudRepository<CustomerLoanDetails, Integer>{

	
}
