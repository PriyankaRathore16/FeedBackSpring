package com.wipro.feedback.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.feedback.model.Visiter;
import com.wipro.feedback.model.VisiterDetails;
import com.wipro.feedback.service.VisiterDetailsService;

@RestController
public class VisiterDetailsController {
	@Autowired
	VisiterDetailsService visiterDetailsService;
	
	@RequestMapping(value="/addVisiterDetails",method=RequestMethod.POST) 	
	public ResponseEntity<Visiter> createVisiterDetails(@RequestBody Visiter visiter) 
	{ 			
//		for(VisiterDetails vd : visiter.getVisiterDetails() ){
//			vd.setVisiter( visiter);
//			
//		}
		visiterDetailsService.save(visiter); 
		return new ResponseEntity<Visiter>(visiter,HttpStatus.CREATED);
	} 	

}
