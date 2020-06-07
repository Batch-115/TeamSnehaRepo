package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;

@Repository
public interface CustDetail_Repository extends CrudRepository<CustomerDetails, Integer>{

}
