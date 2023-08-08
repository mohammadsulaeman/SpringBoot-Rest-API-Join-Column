package com.springboot.crud.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Long deptId;

    private String deptCode;
    private String deptName;
}
