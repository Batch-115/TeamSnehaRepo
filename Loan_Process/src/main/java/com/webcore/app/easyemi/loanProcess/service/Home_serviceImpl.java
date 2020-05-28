package com.webcore.app.easyemi.loanProcess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.LoanAccountStatement;
import com.webcore.app.easyemi.loanProcess.repository.Home_Repository;


@Service
public class Home_serviceImpl implements Home_Service {
	@Autowired
	Home_Repository hr;

	@Override
	public void savedata(LoanAccountStatement lcs) {
		hr.save(lcs);
		
	}

	@Override
	public void deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
//		LoanAccountStatement lc=hr.findById(id).get();
//		hr.delete(lc);
	}

	@Override
	public void updatedata(LoanAccountStatement lcs) {
		// TODO Auto-generated method stub
		hr.save(lcs);
	}
	

}
