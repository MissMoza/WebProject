package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;



@SpringBootApplication
public class WebProjectApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(WebProjectApplication.class, args);
	}
	@Autowired
	public CustomerRepository customerRepository;
	@Override
	public void run(String... args) throws Exception {
	  /*	Customer customer1 =new Customer("Moza Daud", "Ukraine","0779046455","misskepron89@gmail.com","123","All tour");
		customerRepository.save(customer1);
		
		Customer customer2 =new Customer("John Bekar", "Paris","4456677888","mrbeaka@gmail.com","000","prison");
		customerRepository.save(customer2);
		
		Customer customer3 =new Customer("Happy Jaskson", "italy","222223456789","kshapyy@gmail.com","44ka6","thnakss");
		customerRepository.save(customer3);
         */
	}

}
