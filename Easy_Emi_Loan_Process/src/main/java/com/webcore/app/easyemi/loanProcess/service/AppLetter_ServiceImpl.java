package com.webcore.app.easyemi.loanProcess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;
import com.webcore.app.easyemi.loanProcess.repository.AppLetter_Repository;

@Service
public class AppLetter_ServiceImpl implements AppLet_Service {


	@Autowired
	AppLetter_Repository ar;

	public void saveData(ApprovalLetter s) 
	{
		ar.save(s);
		
	}
	
	public ApprovalLetter getAPProvalData(int apId) 
	{
		return ar.findAllByapprovalLetterId(apId);
	}
	
	public Iterable<ApprovalLetter> displayAll() 
	{
		return ar.findAll();
	}
	
	public void delete(int apID) 
	{
		
		ar.deleteById(apID);
	}

	public ApprovalLetter updatedata(int apID ,ApprovalLetter al)
	{
		ApprovalLetter apl = ar.findById(apID).get();
		ar.save(al);
		 return apl;
	}
}
