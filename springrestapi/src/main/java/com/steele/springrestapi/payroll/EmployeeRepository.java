package com.steele.springrestapi.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Extends Jpa Repository to access methods
    
}