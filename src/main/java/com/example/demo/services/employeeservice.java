package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.employee;
import com.example.demo.repositories.employeerepository;

@Service

public class employeeservice {

	@Autowired
	
	employeerepository emprepo;
	
	public employee addemp(employee emp) {
		
		return emprepo.save(emp);//save is used for insert single data
		
	}
	
	public Iterable<employee> addmulti(List<employee> emp) {  // list is used for addingmultiple data at a time
		
		return emprepo.saveAll(emp);  //saveAll is used for inserting multiple data
		
	}
	
	public List<employee> fetchmulti() {  // to fetchalldata
		
		return (List<employee>) emprepo.findAll();  //perform typecasting to fetchalldata
		
	}

	public Optional<employee> fetch(int id) {  //to fetch data by id optional is used for options
		
		return emprepo.findById(id);
		
	}
	
	public String delemp(int id) {  //to delete data by id 
		
		emprepo.deleteById(id);
		
		return "Successfully Deleted: " + id;
	}
	
	public employee update(employee reg) {
	
		int id = reg.getId();
		
		employee reg1 = emprepo.findById(id).get();
		
		reg1.setName(reg.getName());
		
		reg1.setEmail(reg.getEmail());
		
		reg1.setMob_num(reg.getMob_num());
		
		reg1.setCity(reg.getCity());
		
		return emprepo.save(reg1);
	
	}

}