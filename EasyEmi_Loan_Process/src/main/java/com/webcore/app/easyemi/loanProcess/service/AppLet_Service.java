package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;

public interface AppLet_Service {
	public void saveData(ApprovalLetter s) ;
	public ApprovalLetter getAPProvalData(int loanId);
	public Iterable<ApprovalLetter> displayAll() ;
	public void delete(int loanId); 
	public void updatedata(ApprovalLetter al);
	public List<ApprovalLetter> getAllData();
	
}
