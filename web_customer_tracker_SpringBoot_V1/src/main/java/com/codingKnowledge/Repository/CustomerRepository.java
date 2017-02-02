package com.codingKnowledge.Repository;

import org.springframework.data.repository.CrudRepository;

import com.codingKnowledge.Entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
