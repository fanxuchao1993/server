package com.xjgx.physical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xjgx.domain.PhysicalNums;

/**
 * @author xg
 * @date 2018年3月20日-下午3:57:01
 * desc: 
 *     体检人数DAO
 */
@Repository
public interface PhysicalNumsRepository extends JpaRepository<PhysicalNums, String>, JpaSpecificationExecutor<PhysicalNums> {

}
