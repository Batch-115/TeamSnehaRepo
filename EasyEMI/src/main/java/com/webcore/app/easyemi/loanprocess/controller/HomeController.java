package com.webcore.app.easyemi.loanprocess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.loanprocess.model.CustomerDetails;
import com.webcore.app.easyemi.loanprocess.model.DocumentVerification;
import com.webcore.app.easyemi.loanprocess.service.HomeServiceInt;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	HomeServiceInt hs;

	int status = 0;

	/*
	 * @RequestMapping(value = "/getfile/{customerId}",method = RequestMethod.GET)
	 * public List<CustomerDetails> getFiles(@PathVariable("customerId") int
	 * customerId) { List<CustomerDetails> list= hs.getFile(customerId); return
	 * list; }
	 */
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public DocumentVerification documentVerify(@RequestBody DocumentVerification dv) {
	
		hs.savedata(dv);

		return dv;
	}

	
	 @RequestMapping(value = "/getCdata/{customerId}",method = RequestMethod.GET) 
	  public CustomerDetails getCustomerdata(@PathVariable("customerId") int customerId)
	   {
		 CustomerDetails cd = hs.getCustData(customerId);
	     return cd;
	  
	  }
	 
	
	  @RequestMapping(value = "/getVdata/{documentVerificationId}",method = RequestMethod.GET) 
	  public DocumentVerification getdata(@PathVariable("documentVerificationId") int documentVerificationId)
	   {
	     DocumentVerification dv = hs.getVerifiedData(documentVerificationId);
	     return dv;
	  
	  }
	 
	@RequestMapping(value = "/delete/{documentVerificationId}", method = RequestMethod.DELETE)
	public void deletdata(@PathVariable("documentVerificationId") int documentVerificationId) {
		hs.deletedoc(documentVerificationId);

	}

	@RequestMapping(value = "/update/{documentVerificationId}", method = RequestMethod.PUT)
	public void updatedata(@PathVariable("documentVerificationId") int documentVerificationId,
			@RequestBody DocumentVerification dv) {
		hs.updatedoc(dv);

	}

}
