package com.wipro.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wipro.feedback.model.VisiterDetails;
@Repository
public interface VisiterDetailsRepository extends CrudRepository<VisiterDetails, Integer> {

}
