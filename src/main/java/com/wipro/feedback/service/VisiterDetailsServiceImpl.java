package com.wipro.feedback.service;

import java.util.List;
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

            visiterRepository.save(visiter);
            List<VisiterDetails> visiterDetails = visiter.getVisiterDetails();
            for (VisiterDetails details : visiterDetails) {
                details.setVisiter(visiter);
                visiterDetailsRepository.save(details);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            return false;
        }
        return true;
    }

}
