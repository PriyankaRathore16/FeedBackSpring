package com.wipro.feedback.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.feedback.model.Visiter;
import com.wipro.feedback.model.VisiterDetails;
import com.wipro.feedback.repository.VisiterDetailsRepository;
import com.wipro.feedback.repository.VisiterRepository;

@Service
public class VisiterDetailsServiceImpl implements VisiterDetailsService {
	
	@Autowired
	VisiterRepository visiterRepository;

	@Autowired
	VisiterDetailsRepository visiterDetailsRepository;
	
	@Override
	public boolean save(Visiter visiter) {
		// TODO Auto-generated method stub
		try {
			
			System.err.println(visiter.getVisiterDetails());
			/*for(VisiterDetails vd : visiter.getVisiterDetails() ){
				vd.setVisiter(new Visiter());
				vd.getVisiter().setVisiter_gid(visiter.getVisiter_gid());;
				
			}	*/	
			visiterRepository.save(visiter);
			visiterDetailsRepository.saveAll(visiter.getVisiterDetails());
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	

}
