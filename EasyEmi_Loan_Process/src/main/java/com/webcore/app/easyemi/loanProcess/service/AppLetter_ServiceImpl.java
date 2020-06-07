package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;
import com.webcore.app.easyemi.loanProcess.model.EmiDetails;
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
		return ar.findById(apId).get();
	}
	
	public Iterable<ApprovalLetter> displayAll() 
	{
		return ar.findAll();
	}
	
	public void delete(int apID) 
	{
		
		ar.deleteById(apID);
	}

	public void updatedata(ApprovalLetter al)
	{
				ar.save(al);
	}

	@Override
	public List<ApprovalLetter> getAllData() {
		List <ApprovalLetter> li= (List) ar.findAll();
		return li ;
	}
}
