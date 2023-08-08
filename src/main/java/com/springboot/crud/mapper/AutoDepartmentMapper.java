package com.springboot.crud.mapper;

import com.springboot.crud.dto.DepartmentDto;
import com.springboot.crud.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoDepartmentMapper {
    AutoDepartmentMapper MAPPER = Mappers.getMapper(AutoDepartmentMapper.class);

    DepartmentDto mapToDepartmentDto(Department department);

    Department mapToDepartment(DepartmentDto departmentDto);
}
