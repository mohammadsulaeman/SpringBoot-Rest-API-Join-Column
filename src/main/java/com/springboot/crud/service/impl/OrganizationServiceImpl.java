package com.springboot.crud.service.impl;

import com.springboot.crud.dto.OrganizationDto;
import com.springboot.crud.entity.Organization;
import com.springboot.crud.mapper.AutoOrganizationMapper;
import com.springboot.crud.repository.OrganizationRepository;
import com.springboot.crud.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = AutoOrganizationMapper.MAPPER.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        return AutoOrganizationMapper.MAPPER.mapToOrganizationDto(savedOrganization);
    }
}
