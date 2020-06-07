package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.controller.CustomerDetailsController;
import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;
import com.webcore.app.easyemi.loanProcess.repository.CustomerDetails_Repository;



@Service
public class CustomerDetails_ServiceImpl implements CustomerDetails_Service{

	@Autowired
	CustomerDetails_Repository cdr;
	

	@Override
	public List displayAll() {
		// TODO Auto-generated method stub
		return cdr.findAll();
	}



	@Override
	public void savedata(CustomerDetails cd) {
		// TODO Auto-generated method stub
		
		cdr.save(cd);
	}
	

}
