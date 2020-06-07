package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanProcess.model.DocumentVerification;

@Repository
public interface DocVerify_Repository extends CrudRepository<DocumentVerification, Integer>{

}
