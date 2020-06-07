package com.webcore.app.easyemi.loanProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanProcess.model.EmiDetails;

@Repository
public interface Emi_Home_repository extends JpaRepository<EmiDetails,Integer>  {

}
