package com.uniquesystem.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniquesystem.hrms.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
