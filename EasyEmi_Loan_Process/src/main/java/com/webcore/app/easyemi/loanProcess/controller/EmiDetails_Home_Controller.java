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

import com.webcore.app.easyemi.loanProcess.model.EMICardGeneration;
import com.webcore.app.easyemi.loanProcess.model.EmiDetails;
import com.webcore.app.easyemi.loanProcess.service.Home_Service;
@CrossOrigin("*")
@RestController
public class EmiDetails_Home_Controller {
	
	@Autowired
	Home_Service hs;
	@ResponseBody
	@RequestMapping(value = "/reg",method = RequestMethod.POST)
public void emidata(@RequestBody EmiDetails emidata)
{
	//System.out.println(emidata.getNoOfEmi());
		hs.saveemidata(emidata);
		//hs.savecardgenrateddata(ecg);
	}
	@ResponseBody
	@RequestMapping(value = "/cardreg",method = RequestMethod.POST)
public void carddata(@RequestBody EMICardGeneration ecg)
{
	
		
		hs.savecardgenrateddata(ecg);
	}

	@ResponseBody
	@RequestMapping(value = "/getall",method = RequestMethod.GET)
public List<EmiDetails> emidataget()
{
	List<EmiDetails> list=hs.getemidetails();
	return	list;
	}
	@ResponseBody
	@RequestMapping(value = "/cardgetall",method = RequestMethod.GET)
public List<EMICardGeneration> cardemidataget()
{
	List<EMICardGeneration> list=hs.getcardemidetails();
	return	list;
	}

	@ResponseBody
	@RequestMapping(value = "/cardgetsingle/{id}",method = RequestMethod.GET)
public EMICardGeneration singlecardemidataget(@PathVariable int id)
{
   EMICardGeneration  list=hs.getsinglecardemidetails(id);
	return	list;
	}
	@ResponseBody
	@RequestMapping(value = "/getsingle/{id}",method = RequestMethod.GET)
public EmiDetails singleemidataget(@PathVariable int id)
{
   EmiDetails list=hs.getsingleemidetails(id);
   System.out.println(list);
	return	list;
	}


	@ResponseBody
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
public void deleteemidata(@PathVariable int id)
{
	hs.deletedata(id);
	
	}
	@ResponseBody
	@RequestMapping(value = "/carddelete/{id}",method = RequestMethod.DELETE)
public void deleteemicarddata(@PathVariable int id)
{
	hs.deletecarddata(id);
	
	}
	@ResponseBody
	@RequestMapping(value = "/update",method = RequestMethod.PUT)
public void emidataupdate(@RequestBody EmiDetails emidata)
{
	//System.out.println(emidata.getNoOfEmi());
		hs.updateemidata(emidata);
		//hs.savecardgenrateddata(ecg);
	}
	@ResponseBody
	@RequestMapping(value = "/cardupdate",method = RequestMethod.PUT)
public void cardemidataupdate(@RequestBody EMICardGeneration emidata)
{
	//System.out.println(emidata.getNoOfEmi());
		hs.updatecardemidata(emidata);
		//hs.savecardgenrateddata(ecg);
	}


}
