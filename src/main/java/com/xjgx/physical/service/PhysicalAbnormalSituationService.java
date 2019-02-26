package com.xjgx.physical.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.xjgx.domain.PhysicalAbnormalSituation;
import com.xjgx.physical.dao.PhysicalAbnormalSituationMapperDAO;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PageMybatisIns;

@Service
public class PhysicalAbnormalSituationService {
	
	@Resource
	private PhysicalAbnormalSituationMapperDAO physicalAbnormalSituationMapperDAO ;
	
	public List<PhysicalAbnormalSituation> queryAbnormalList(String orgId, 
			String startDate, String endDate, String column) {
		return physicalAbnormalSituationMapperDAO.queryAbnormalList(orgId, startDate, endDate, column) ;
	}
	
	
	public PageMybatis<PhysicalAbnormalSituation> queryAbnormalTables(PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalAbnormalSituation, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String,Object> obj, String sortName, String sortOrder) {
				physicalAbnormalSituationMapperDAO.queryAbnormalTables(obj);
			}
		});
	}
	
	public List<PhysicalAbnormalSituation> queryAbnormalByOrg(String orgId, 
			String startDate, String endDate) {
		return physicalAbnormalSituationMapperDAO.queryAbnormalByOrg(orgId, startDate, endDate) ;
	}
	
	public PageMybatis<PhysicalAbnormalSituation> queryAbnormalByOrgTables(PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalAbnormalSituation, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String,Object> obj, String sortName, String sortOrder) {
				physicalAbnormalSituationMapperDAO.queryAbnormalByOrgTables(obj);
			}
		});
	}
	
	
}
