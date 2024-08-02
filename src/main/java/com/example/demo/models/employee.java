package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity  //to create table

public class employee {
	
	@Id  //starting position of table
	
	@GeneratedValue(strategy = GenerationType.AUTO)  //for id auto increment
	
	private int id;  
	
	@Size(max = 40 , min = 3)
	
	private String name;
	
	@Email

	private String email;
	
	private long mob_num;
	
	private String city;
}
