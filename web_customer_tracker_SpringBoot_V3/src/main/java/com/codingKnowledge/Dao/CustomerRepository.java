package com.codingKnowledge.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingKnowledge.Entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
