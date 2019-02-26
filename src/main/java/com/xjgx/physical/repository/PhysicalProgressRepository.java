package com.xjgx.physical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xjgx.domain.PhysicalProgress;

@Repository
public interface PhysicalProgressRepository extends JpaRepository<PhysicalProgress, String>, JpaSpecificationExecutor<PhysicalProgress>{

}
