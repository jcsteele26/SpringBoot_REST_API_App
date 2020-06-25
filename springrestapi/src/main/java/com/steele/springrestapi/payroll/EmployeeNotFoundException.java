package com.steele.springrestapi.payroll;

class EmployeeNotFoundException extends RuntimeException{

    EmployeeNotFoundException(Long id) { //Error for employee not found
        super("Could not find employee " + id);
      }
    
}