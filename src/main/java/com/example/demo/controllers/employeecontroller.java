package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.employee;
import com.example.demo.services.employeeservice;
@Controller("/")  //springmvc

//@RestController //to post data using postman

@CrossOrigin("http://localhost:4200")  //to connect angular  3000 for react

@RequestMapping("/api/v1") //for api not necessary

public class employeecontroller {

	@Autowired
	
	employeeservice empser;
	
	@PostMapping("/adding") //used for post data by postman
	
	public employee addemp (@RequestBody employee emp) { //requestbody is used to post the data
		
		return empser.addemp(emp);
		
	}
	
	@PostMapping("/addingmulti") 
	
	public Iterable<employee> addmulti (@RequestBody List<employee> emp) {
		
		return empser.addmulti(emp);
		
	}

	@GetMapping("/fetchmulti")  //for fetching data
	
	public List<employee> fetchmulti() {
		
		return empser.fetchmulti();
	}
	
	@GetMapping("/fetchbyid/{id}") //this is used for fetching data by id  we have to type our required id 
	
	public Optional<employee> fetch(@PathVariable int id) { //pathvariable is used for fetch data
		
		return empser.fetch(id);
		
	}
	
	@DeleteMapping("/delete/{id}")  //for data deletion by using id
	
	public String delemp(@PathVariable int id) {  //pathvariable is used for fetch data
		
		return empser.delemp(id);
	}
	
	@PutMapping("/update") //for update data
	
	public employee updating(@RequestBody employee emp) {
	
		return empser.update(emp);
	
	}
	
}
