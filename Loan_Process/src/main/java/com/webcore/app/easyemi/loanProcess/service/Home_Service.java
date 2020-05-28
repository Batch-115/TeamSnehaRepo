package com.webcore.app.easyemi.loanProcess.service;

import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;

public interface Home_Service {
	public void saveData(ApprovalLetter s) ;
	public ApprovalLetter getAPProvalData(int loanId);
	public Iterable<ApprovalLetter> displayAll() ;
	public void delete(int loanId); 
	public ApprovalLetter updatedata(int loanId ,ApprovalLetter al);
}
