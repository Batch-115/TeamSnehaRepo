package com.webcore.app.easyemi.loanProcess.service;

import java.util.List;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.DocumentVerification;

public interface DocVerify_Service {
	
	void deletedoc(int documentVerificationId);

	void updatedoc(DocumentVerification dv);

	void savedata(DocumentVerification dv);

	DocumentVerification getVerifiedData(int documentVerificationId);

	CustomerDetails getCustData(int customerId);

	List<DocumentVerification> getAllData();

	List<CustomerDetails> getCData();


}
