package com.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.EmployeeModel;

@Repository
public interface IEmployeeDao extends JpaRepository<EmployeeModel,Long> {

}
