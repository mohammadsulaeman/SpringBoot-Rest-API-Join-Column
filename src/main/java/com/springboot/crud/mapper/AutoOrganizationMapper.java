package com.springboot.crud.mapper;

import com.springboot.crud.dto.OrganizationDto;
import com.springboot.crud.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoOrganizationMapper {
    AutoOrganizationMapper MAPPER = Mappers.getMapper(AutoOrganizationMapper.class);

    Organization mapToOrganization(OrganizationDto organizationDto);
    OrganizationDto mapToOrganizationDto(Organization organization);
}
