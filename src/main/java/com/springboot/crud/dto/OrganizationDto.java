package com.springboot.crud.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {
    private Long orgId;

    private String orgCode;
    private String orgName;
}
