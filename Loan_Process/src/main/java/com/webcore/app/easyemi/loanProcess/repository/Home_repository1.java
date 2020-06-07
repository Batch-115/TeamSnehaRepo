package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanProcess.model.EMICardGeneration;
import com.webcore.app.easyemi.loanProcess.model.EmiDetails;

@Repository
public interface Home_repository1 extends JpaRepository<EMICardGeneration, Integer> {

}
