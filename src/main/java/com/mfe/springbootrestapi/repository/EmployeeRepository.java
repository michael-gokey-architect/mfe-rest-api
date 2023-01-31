package com.mfe.springbootrestapi.repository;

import com.mfe.springbootrestapi.model.Employee;
//import com.mfe.springbootrestapi.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
