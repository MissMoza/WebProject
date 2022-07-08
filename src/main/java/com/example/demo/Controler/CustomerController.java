package com.example.demo.Controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.repository.CustomerRepository;

@Controller




public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	@GetMapping("/login")
	public String ViewPage(Model model) {
		return "login";
	}
	
   @GetMapping("/customers")
   public String listCustomers(Model model) {
	   model.addAttribute("customers",customerService.getAllCustomers());
	   return "customers";
   }
   
   @GetMapping("/customers/new")
   public String createBookingForm(Model model) {
	   Customer customer = new Customer();
	   model.addAttribute("customer",customer);
	   return "book_town";
   }
   
  

   
   @PostMapping("/customers")
   public String saveCustomer(@ModelAttribute("customer") Customer customer) {
	   customerService.saveCustomer(customer);
	   return "redirect:/customers";
   
   }
   @GetMapping("/customers/edit/{id}")
   public String editCustomerForm(@PathVariable Long id,Model model) {
	   model.addAttribute("customer",customerService.getCustomerById(id));
	   return "edit_customer";
   }
   
   
   
   
   @PostMapping("/customers/{id}")
   public String updateCustomer(@PathVariable Long id,
		   @ModelAttribute("customer")Customer customer,
		   Model model) {
	   
	   
	   Customer existingCustomer =customerService.getCustomerById(id);
	   existingCustomer.setId(id);
	   existingCustomer.setName(customer.getName());
	   existingCustomer.setPassword(customer.getPassword());
	   existingCustomer.setAddress(customer.getAddress());
	   existingCustomer.setEmail(customer.getEmail());
	   existingCustomer.setPhone(customer.getPhone());
	   existingCustomer.setDetails(customer.getDetails());
	   
	   customerService.updateCustomer(existingCustomer);
	   return "redirect:/customers";
   }
   @GetMapping("/customers/{id}")
   public String deleteCustomer(@PathVariable Long id) {
	   customerService.deleteCustomerById(id);
	   return "redirect:/customers";
	   
   }
}
