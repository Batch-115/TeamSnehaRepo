package com.webcore.app.easyemi.loanprocess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.loanprocess.model.CustomerDetails;

@Repository
public interface CustDetailDao extends CrudRepository<CustomerDetails, Integer> {

}
