package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;
import com.webcore.app.easyemi.loanProcess.repository.CustDetail_Repository;
import com.webcore.app.easyemi.loanProcess.repository.Statement_Repository;

@Service
public class Statement_ServiceImpl implements Statement_Service {

	@Autowired
	Statement_Repository sr;
	
	@Autowired
	CustDetail_Repository cdr;

	@Override
	public void savedata(LoanAccountStatement lcs) {
		// TODO Auto-generated method stub
		sr.save(lcs);
		
	}

	@Override
	public CustomerDetails getCustData(int customerId) {
		// TODO Auto-generated method stub
		return cdr.findById(customerId).get();
	}

	@Override
	public List displayAll() {
		// TODO Auto-generated method stub
		return (List) sr.findAll();
	}

	@Override
	public void deletedata(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public void updatedata(LoanAccountStatement lcs) {
		// TODO Auto-generated method stub
		sr.save(lcs);
	}
	
	
	
	
}
