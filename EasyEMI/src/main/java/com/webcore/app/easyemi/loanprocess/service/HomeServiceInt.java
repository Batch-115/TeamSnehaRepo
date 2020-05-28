package com.webcore.app.easyemi.loanprocess.service;


import java.util.List;

import com.webcore.app.easyemi.loanprocess.model.CustomerDetails;
import com.webcore.app.easyemi.loanprocess.model.DocumentVerification;

public interface HomeServiceInt {



	

	void deletedoc(int documentVerificationId);

	void updatedoc(DocumentVerification dv);

	void savedata(DocumentVerification dv);

	DocumentVerification getVerifiedData(int documentVerificationId);

	CustomerDetails getCustData(int customerId);






	
}
