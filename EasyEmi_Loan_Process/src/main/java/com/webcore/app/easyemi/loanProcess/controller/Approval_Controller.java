package com.webcore.app.easyemi.loanProcess.controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
	import com.webcore.app.easyemi.loanProcess.model.ApprovalLetter;
import com.webcore.app.easyemi.loanProcess.model.CustomerDetails;
import com.webcore.app.easyemi.loanProcess.service.AppLet_Service;
	
	
	@CrossOrigin("*")
	@RestController
	public class Approval_Controller {
		@Autowired
		AppLet_Service hs;
		
		@RequestMapping(value="/postAppData",method=RequestMethod.POST)
		public ApprovalLetter registerdata(@RequestBody ApprovalLetter al)
		{		
			System.out.println("ApprovalLetter data save");
			hs.saveData(al);
			return al;
		}
		
	@RequestMapping(value = "/getAppData",method = RequestMethod.GET)
	public List<ApprovalLetter> getAppData()
		{
		List<ApprovalLetter> la =hs.getAllData();	
			return la;
		}
				
		
	    @ResponseBody			
		@RequestMapping(value="/deleteApp/{id}",method=RequestMethod.DELETE)
		public void delete(@PathVariable int id) 
		{
			hs.delete(id);
			System.out.println("ApprovalLetter data delete");
			
				
		}
		
		
		@RequestMapping(value="/updateApp",method=RequestMethod.PUT)
		public void update(@RequestBody ApprovalLetter al)
		{
			hs.updatedata(al);
			System.out.println("ApprovalLetter data update");
			
			
			
		}
}
