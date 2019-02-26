package com.xjgx.physical.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjgx.domain.PhysicalProgress;
import com.xjgx.physical.dao.PhysicalProgressMapperDAO;
import com.xjgx.physical.repository.PhysicalProgressRepository;

@Service
public class PhysicalProgressService {
	
	@Resource
	private PhysicalProgressRepository physicalProgressRepository ;
	
	@Resource
	private PhysicalProgressMapperDAO physicalProgressMapperDAO ;
	
	public List<PhysicalProgress> queryList(String orgId, String physicalDate) {
		return physicalProgressMapperDAO.queryList(orgId, physicalDate) ;
	}
	
	public List<PhysicalProgress> queryListByMonthSum(String orgId, int year) {
		return physicalProgressMapperDAO.queryListByMonthSum(orgId, year) ;
	}
}
