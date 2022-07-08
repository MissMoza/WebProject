package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "full_name", nullable = false)
	private String name;
	
    
    
    @Column(name = "address", nullable = false)
	private String address;
    
    @Column(name = "email", nullable = false)
	private String email;
    
    @Column(name = "phone", nullable=false)
   	private String Phone;
       
    @Column(name = "password", nullable = false)
	private String password;
    
   
    @Column(name = "detail", nullable=false)
	private String details;
	
	public Customer() {
		
	}
	
	
	
	
	
	public Customer(String name, String password, String address, String email, String phone, String details) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		Phone = phone;
		this.details = details;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	

}
