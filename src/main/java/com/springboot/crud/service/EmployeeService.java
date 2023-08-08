package com.springboot.crud.service;

import com.springboot.crud.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> fetchAllEmployee();
}
