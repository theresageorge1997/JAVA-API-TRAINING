package com.ust.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.ust.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
