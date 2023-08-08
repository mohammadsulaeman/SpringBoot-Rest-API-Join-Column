package com.springboot.crud.service.impl;

import com.springboot.crud.dto.DepartmentDto;
import com.springboot.crud.entity.Department;
import com.springboot.crud.mapper.AutoDepartmentMapper;
import com.springboot.crud.repository.DepartmentRepository;
import com.springboot.crud.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
       return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);
    }
}
