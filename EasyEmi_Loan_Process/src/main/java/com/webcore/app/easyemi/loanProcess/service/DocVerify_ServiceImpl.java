package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.DocumentVerification;
import com.webcore.app.easyemi.loanProcess.repository.CustomerDetails_Repository;
import com.webcore.app.easyemi.loanProcess.repository.DocVerify_Repository;
@Service
public class DocVerify_ServiceImpl implements DocVerify_Service{


	@Autowired
	DocVerify_Repository dvr;
	
	@Autowired
	CustomerDetails_Repository cdr;
	
	@Override
	public void deletedoc(int documentVerificationId) {

		dvr.deleteById(documentVerificationId);
	}


	@Override
	public void updatedoc(DocumentVerification dv) {

		dvr.save(dv);
		}


	@Override
	public void savedata(DocumentVerification dv) {

		dvr.save(dv);
	}


	@Override
	public DocumentVerification getVerifiedData(int documentVerificationId) {
         return dvr.findById(documentVerificationId).get();
		
	}


	@Override
	public CustomerDetails getCustData(int customerId) {
		return cdr.findById(customerId).get();
	}


	@Override
	public List<DocumentVerification> getAllData() {

		return (List<DocumentVerification>) dvr.findAll();
	}


	@Override
	public List<CustomerDetails> getCData() {
		return (List<CustomerDetails>) cdr.findAll();
	}	
}
