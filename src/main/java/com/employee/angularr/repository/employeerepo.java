package com.employee.angularr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.angularr.model.Employee;

@Repository
public interface employeerepo extends JpaRepository<Employee, Long> {

}
