package com.xjgx.physical.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.xjgx.domain.PhysicalAbnormalAge;
import com.xjgx.domain.PhysicalDisease;
import com.xjgx.domain.PhysicalDiseaseSituation;
import com.xjgx.physical.dao.PhysicalDiseaseMapperDAO;
import com.xjgx.physical.dto.AbnormalZbDTO;
import com.xjgx.physical.repository.PhysicalDiseaseRepository;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PageMybatisIns;

@Service
public class PhysicalDiseaseService {
	
	@Resource
	private PhysicalDiseaseRepository physicalDiseaseRepository ;
	@Resource
	private PhysicalDiseaseMapperDAO physicalDiseaseMapperDAO ;
	
	public List<AbnormalZbDTO> queryListTop10(String orgId, String startDate, String endDate) {
		return physicalDiseaseMapperDAO.queryListTop10(orgId, startDate, endDate) ;
	}
	
	public List<AbnormalZbDTO> queryDiseaseList(String orgId, String startDate, String endDate, String diseaseCode) {
		return physicalDiseaseMapperDAO.queryDiseaseList(orgId, startDate, endDate, diseaseCode) ;
	}
	public List <PhysicalDisease> queryDiseaseListFan(String pOrgId,String orgName){
		return  physicalDiseaseMapperDAO.queryDiseaseListFan(pOrgId,orgName);
	}
	
	public List <PhysicalDisease> queryOrgByDiseaseList(String orgId, String startDate, String endDate){
		return  physicalDiseaseMapperDAO.queryOrgByDiseaseList(orgId,startDate,endDate);
	}
	
	public List<PhysicalDisease> queryListTop10ByOrg(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate){
		return physicalDiseaseMapperDAO.queryListTop10ByOrg(orgId,startDate,endDate);
	}
	
	public PageMybatis<PhysicalDisease> queryDiseasesumByOrg(
			PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalDisease, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String, Object> obj, String sortName, String sortOrder) {
				physicalDiseaseMapperDAO.queryDiseasesumByOrg(obj);
			}
		});
	}
	
	public List<PhysicalDisease> queryDiseaseBySexList(String orgId, String startDate, 
			String endDate, String column) {
		return physicalDiseaseMapperDAO.queryDiseaseBySexList(orgId, startDate, endDate, column) ;
	}
	
	public PageMybatis<PhysicalDisease> queryDiseaseBySexTables(PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<PhysicalDisease, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String,Object> obj, String sortName, String sortOrder) {
				physicalDiseaseMapperDAO.queryDiseaseBySexTables(obj);
			}
		});
	}
}

