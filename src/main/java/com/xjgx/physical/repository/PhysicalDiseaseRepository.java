package com.xjgx.physical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xjgx.domain.PhysicalDisease;

@Repository
public interface PhysicalDiseaseRepository extends JpaRepository<PhysicalDisease, String>, JpaSpecificationExecutor<PhysicalDisease> {

}
