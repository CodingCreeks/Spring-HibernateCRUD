package com.codingKnowledge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingKnowledge.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
