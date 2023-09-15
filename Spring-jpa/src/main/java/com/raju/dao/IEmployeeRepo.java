package com.raju.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raju.model.Employee;
@Repository	
public interface IEmployeeRepo extends CrudRepository<Employee, Integer>{

}
