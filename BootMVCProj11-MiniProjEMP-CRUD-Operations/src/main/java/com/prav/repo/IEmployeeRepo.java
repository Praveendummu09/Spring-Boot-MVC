package com.prav.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prav.model.Employee;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

}
