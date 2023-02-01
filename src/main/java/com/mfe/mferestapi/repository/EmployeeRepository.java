package com.mfe.mferestapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.mfe.mferestapi.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}