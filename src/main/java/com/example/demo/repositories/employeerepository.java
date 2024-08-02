package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.employee;

@Repository

public interface employeerepository extends CrudRepository<employee, Integer>{  //performs crud operations jsprepo and crudrepo are same
//above employee is the modelname and integer means starting point datatype
}
