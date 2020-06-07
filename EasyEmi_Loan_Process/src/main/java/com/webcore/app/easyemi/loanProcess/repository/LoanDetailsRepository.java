package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.repository.CrudRepository;

import com.webcore.app.easyemi.loanProcess.model.CustomerLoanDetails;

public interface LoanDetailsRepository extends CrudRepository<CustomerLoanDetails, Integer>{

}
