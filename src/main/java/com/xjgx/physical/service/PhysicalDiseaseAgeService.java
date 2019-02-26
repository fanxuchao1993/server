package com.xjgx.physical.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjgx.domain.PhysicalAbnormalAge;
import com.xjgx.domain.PhysicalDiseaseAge;
import com.xjgx.physical.dao.PhysicalAbnormalAgeMapperDAO;
import com.xjgx.physical.dao.PhysicalDiseaseAgeMapperDAO;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PageMybatisIns;

@Service
public class PhysicalDiseaseAgeService {
	
	@Resource
	private PhysicalDiseaseAgeMapperDAO diseaseAgeMapperDAO ;
	
	public List<PhysicalDiseaseAge> queryDiseaseAgeList(String orgId, String startDate, 
			String endDate, String column) {
		return diseaseAgeMapperDAO.queryDiseaseAgeList(orgId, startDate, endDate, column) ;
	}
	
	public PageMybatis<PhysicalDiseaseAge> queryDiseaseAgeTables(PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalDiseaseAge, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String,Object> obj, String sortName, String sortOrder) {
				diseaseAgeMapperDAO.queryDiseaseAgeTables(obj);
			}
		});
	}
	
}
