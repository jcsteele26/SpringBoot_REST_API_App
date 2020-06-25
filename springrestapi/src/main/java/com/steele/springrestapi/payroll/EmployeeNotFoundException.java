package com.steele.springrestapi.payroll;

class EmployeeNotFoundException extends RuntimeException{

    /**
   *
   */
  private static final long serialVersionUID = 1L;

  EmployeeNotFoundException(Long id) { // Error for employee not found
        super("Could not find employee " + id);
      }
    
}