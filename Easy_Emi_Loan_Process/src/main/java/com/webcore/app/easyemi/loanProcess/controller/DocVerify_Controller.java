package com.webcore.app.easyemi.loanProcess.controller;


	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.model.DocumentVerification;
import com.webcore.app.easyemi.loanProcess.service.DocVerify_Service;

	

	@CrossOrigin("*")
	@RestController
	public class DocVerify_Controller {

		@Autowired
		DocVerify_Service dvs;
		
		@RequestMapping(value = "/post", method = RequestMethod.POST)
		public DocumentVerification documentVerify(@RequestBody DocumentVerification dv) {
		
			dvs.savedata(dv);

			return dv;
		}

		
		 @RequestMapping(value = "/getCdata/{customerId}",method = RequestMethod.GET) 
		  public CustomerDetails getCustomerdata(@PathVariable("customerId") int customerId)
		   {
			 CustomerDetails cd = dvs.getCustData(customerId);
		     return cd;
		  
		  }
		 
		
		  @RequestMapping(value = "/getVdata/{documentVerificationId}",method = RequestMethod.GET) 
		  public DocumentVerification getdata(@PathVariable("documentVerificationId") int documentVerificationId)
		   {
		     DocumentVerification dv = dvs.getVerifiedData(documentVerificationId);
		     return dv;
		  
		  }
		 
		@RequestMapping(value = "/delete/{documentVerificationId}", method = RequestMethod.DELETE)
		public void deletdata(@PathVariable("documentVerificationId") int documentVerificationId)
		{
			dvs.deletedoc(documentVerificationId);

		}

		@RequestMapping(value = "/update/{documentVerificationId}", method = RequestMethod.PUT)
		public void updatedata(@PathVariable("documentVerificationId") int documentVerificationId,@RequestBody DocumentVerification dv)
		{
			dvs.updatedoc(dv);

		}

}
