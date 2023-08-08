package com.springboot.crud.service.impl;

import com.springboot.crud.dto.EmployeeDto;
import com.springboot.crud.entity.Employee;
import com.springboot.crud.mapper.AutoEmployeeMapper;
import com.springboot.crud.repository.EmployeeRepository;
import com.springboot.crud.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        System.out.println(employeeDto);
        Employee employee = new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setPhone(employeeDto.getPhone());
        employee.setEmail(employeeDto.getEmail());
        employee.setDepartment(employeeDto.getDepartment());
        employee.setOrganization(employeeDto.getOrganization());
        System.out.println(employee.toString());
        Employee savedEmployee = employeeRepository.save(employee);
        System.out.println(savedEmployee.toString());
        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setEmpId(savedEmployee.getEmpId());
        employeeDto1.setFirstName(savedEmployee.getFirstName());
        employeeDto1.setLastName(savedEmployee.getLastName());
        employeeDto1.setPhone(savedEmployee.getPhone());
        employeeDto1.setEmail(savedEmployee.getEmail());
        employeeDto1.setDepartment(savedEmployee.getDepartment());
        employeeDto1.setOrganization(savedEmployee.getOrganization());
        System.out.println(employeeDto1);
        return employeeDto1;
    }

    @Override
    public List<EmployeeDto> fetchAllEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        employeeList.forEach((employee)->{
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setEmpId(employee.getEmpId());
            employeeDto.setFirstName(employee.getFirstName());
            employeeDto.setLastName(employee.getLastName());
            employeeDto.setPhone(employee.getPhone());
            employeeDto.setEmail(employee.getEmail());
            employeeDto.setDepartment(employee.getDepartment());
            employeeDto.setOrganization(employee.getOrganization());
            employeeDtoList.add(employeeDto);
        });
        return employeeDtoList;
    }
}
