package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;

@Repository
public interface Statement_Repository extends CrudRepository<LoanAccountStatement, Integer>{

}
