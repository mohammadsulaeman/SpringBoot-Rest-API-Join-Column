package com.springboot.crud.controller;

import com.springboot.crud.dto.EmployeeDto;
import com.springboot.crud.entity.Department;
import com.springboot.crud.entity.Organization;
import com.springboot.crud.repository.DepartmentRepository;
import com.springboot.crud.repository.OrganizationRepository;
import com.springboot.crud.service.EmployeeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    private DepartmentRepository departmentRepository;
    private OrganizationRepository organizationRepository;

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> fetchAllEmployee(){
        List<EmployeeDto> employeeDtoList = employeeService.fetchAllEmployee();
        return new ResponseEntity<>(employeeDtoList,HttpStatus.OK);
    }
    @PostMapping("{deptId}/{orgId}")
    public ResponseEntity<EmployeeDto> saveEmployee(@PathVariable("deptId") Long deptId, @PathVariable("orgId") Long orgId, @RequestBody EmployeeDto employeeDto){
        System.out.println(employeeDto);
        Department department = departmentRepository.findById(deptId).orElseThrow(()-> new EntityNotFoundException("DeptID not found"));
        System.out.println(department);
        Organization organization = organizationRepository.findById(orgId).orElseThrow(()-> new EntityNotFoundException("OrgId not found"));
        System.out.println(organization);
        employeeDto.setDepartment(department);
        employeeDto.setOrganization(organization);
        EmployeeDto savedEmployeeDto = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
    }
}
