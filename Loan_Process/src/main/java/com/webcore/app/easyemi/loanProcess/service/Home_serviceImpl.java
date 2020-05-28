package com.webcore.app.easyemi.loanProcess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;
import com.webcore.app.easyemi.loanProcess.repository.Home_Repository;


@Service
public class Home_serviceImpl implements Home_Service {

	@Autowired
	Home_Repository hr;

	public void saveData(ApprovalLetter s) 
	{
		hr.save(s);
		
	}
	
	public ApprovalLetter getAPProvalData(int apId) 
	{
		return hr.findById(apId).get();
	}
	
	public Iterable<ApprovalLetter> displayAll() 
	{
		return hr.findAll();
	}
	
	public void delete(int apID) 
	{
		
		hr.deleteById(apID);
	}

	public ApprovalLetter updatedata(int apID ,ApprovalLetter al)
	{
		ApprovalLetter apl = hr.findById(apID).get();
		hr.save(al);
		 return apl;
	}
}
