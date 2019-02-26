package com.xjgx.physical.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.xjgx.domain.PhysicalDiseaseSituation;
import com.xjgx.physical.dao.PhysicalDiseaseSituationMapperDAO;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PageMybatisIns;

@Service
public class PhysicalDiseaseSituationService {

	@Resource
	private PhysicalDiseaseSituationMapperDAO physicalDiseaseSituationMapperDAO;

	public List<PhysicalDiseaseSituation> queryDiseaseSituationByGrpList(String orgId, String startDate, String endDate,
			String column) {
		return physicalDiseaseSituationMapperDAO.queryDiseaseSituationByGrpList(orgId, startDate, endDate, column);
	}

	public PageMybatis<PhysicalDiseaseSituation> queryDiseaseSituationByGrpTables(
			PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalDiseaseSituation, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String, Object> obj, String sortName, String sortOrder) {
				physicalDiseaseSituationMapperDAO.queryDiseaseSituationByGrpTables(obj);
			}
		});
	}

	public List<PhysicalDiseaseSituation> queryDiseaseSituationByOrgList(String orgId, String startDate, String endDate,
			String column) {
		return physicalDiseaseSituationMapperDAO.queryDiseaseSituationByOrgList(orgId, startDate, endDate, column);
	}

	public PageMybatis<PhysicalDiseaseSituation> queryDiseaseSituationByOrgTables(
			PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalDiseaseSituation, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String, Object> obj, String sortName, String sortOrder) {
				physicalDiseaseSituationMapperDAO.queryDiseaseSituationByOrgTables(obj);
			}
		});
	}
}
