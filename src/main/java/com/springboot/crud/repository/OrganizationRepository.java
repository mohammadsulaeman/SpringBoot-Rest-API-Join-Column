package com.springboot.crud.repository;

import com.springboot.crud.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
}
