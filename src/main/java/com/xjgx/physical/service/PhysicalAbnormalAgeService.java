package com.xjgx.physical.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjgx.domain.PhysicalAbnormalAge;
import com.xjgx.physical.dao.PhysicalAbnormalAgeMapperDAO;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PageMybatisIns;

@Service
public class PhysicalAbnormalAgeService {
	
	@Resource
	private PhysicalAbnormalAgeMapperDAO abnormalAgeMapperDAO ;
	
	public List<PhysicalAbnormalAge> queryAbnormalAgeList(String orgId, String startDate, 
			String endDate, String column) {
		return abnormalAgeMapperDAO.queryAbnormalAgeList(orgId, startDate, endDate, column) ;
	}
	
	public PageMybatis<PhysicalAbnormalAge> queryAbnormalAgeTables(PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalAbnormalAge, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String,Object> obj, String sortName, String sortOrder) {
				abnormalAgeMapperDAO.queryAbnormalAgeTables(obj);
			}
		});
	}
	
}
