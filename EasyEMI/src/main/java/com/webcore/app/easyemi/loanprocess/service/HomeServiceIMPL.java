package com.webcore.app.easyemi.loanprocess.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanprocess.model.CustomerDetails;
import com.webcore.app.easyemi.loanprocess.model.DocumentVerification;
import com.webcore.app.easyemi.loanprocess.repository.CustDetailDao;
import com.webcore.app.easyemi.loanprocess.repository.HomeDao;

@Service
public class HomeServiceIMPL implements HomeServiceInt {
	
	@Autowired
	HomeDao hd;

	@Autowired
	CustDetailDao cdd;
	
	

	@Override
	public void deletedoc(int documentVerificationId) {

		hd.deleteById(documentVerificationId);
	}


	@Override
	public void updatedoc(DocumentVerification dv) {

		hd.save(dv);
		}


	@Override
	public void savedata(DocumentVerification dv) {

		hd.save(dv);
	}


	@Override
	public DocumentVerification getVerifiedData(int documentVerificationId) {
         return hd.findById(documentVerificationId).get();
		
	}


	@Override
	public CustomerDetails getCustData(int customerId) {
		return cdd.findById(customerId).get();
	}


	

	}


	


