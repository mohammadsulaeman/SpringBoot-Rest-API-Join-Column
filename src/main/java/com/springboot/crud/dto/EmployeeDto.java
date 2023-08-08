package com.springboot.crud.dto;


import com.springboot.crud.entity.Department;
import com.springboot.crud.entity.Organization;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long empId;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Department department;
    private Organization organization;
}
