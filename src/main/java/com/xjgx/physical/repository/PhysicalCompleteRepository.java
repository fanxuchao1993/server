package com.xjgx.physical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xjgx.domain.PhysicalComplete;

@Repository
public interface PhysicalCompleteRepository extends JpaRepository<PhysicalComplete, String>, JpaSpecificationExecutor<PhysicalComplete>{

}
