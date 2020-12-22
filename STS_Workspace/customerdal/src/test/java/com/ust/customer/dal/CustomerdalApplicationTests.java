package com.ust.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.customer.dal.entities.Customer;
import com.ust.customer.dal.repos.CustomerRepository;


@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {
	Customer customer = new Customer();
	customer.setName("Theresa");
	customer.setEmail("theresa@gmail.com");
	customer.setLocation("Angamaly");
	
	customerRepository.save(customer);
	}

	@Test
	public void testFindCustomerById() {
	Customer customer = customerRepository.findById(1l).get();
	System.out.println(customer);
	}
	
	@Test
	public void testUpdateCustomer() {
	Customer customer = customerRepository.findById(1l).get();
	customer.setEmail("theresa@ust.com");
	customerRepository.save(customer);
	}
	
	  @Test
	  public void testDeleteCustomer()
	  {
	    // Customer customer = customerRepository.findById((long) 1).get();
	    //student.setEmail("theresa@ust.com");  
		  Customer customer = new Customer();
		  customer.setId(1l);
		  customerRepository.delete(customer);
	    //System.out.println(student);
	  }
  
//  @Test
//  public void testDeleteCustomer()
//  {
//    //Customer customer = customerRepository.findById(1).get();
//    //student.setEmail("theresa@ust.com");
//    Customer customer = new Customer();
//    customer.setId((long) 5);  
//    customerRepository.delete(customer);
//    System.out.println(customer);
//  }
	
}
