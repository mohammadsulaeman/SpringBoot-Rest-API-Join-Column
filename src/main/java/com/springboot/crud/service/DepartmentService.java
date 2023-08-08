package com.springboot.crud.service;

import com.springboot.crud.dto.DepartmentDto;
import com.springboot.crud.entity.Department;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
}
