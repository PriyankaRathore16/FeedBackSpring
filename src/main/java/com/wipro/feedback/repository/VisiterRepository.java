package com.wipro.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.feedback.model.Visiter;
@Repository
public interface VisiterRepository extends CrudRepository<Visiter, Integer> {

}
