package com.webcore.app.easyemi.loanprocess.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanprocess.model.CustomerDetails;
import com.webcore.app.easyemi.loanprocess.model.DocumentVerification;

@Repository
public interface HomeDao extends CrudRepository<DocumentVerification, Integer>{



	

}
