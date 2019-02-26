package com.xjgx.physical.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjgx.domain.PhysicalAbnormalAge;
import com.xjgx.physical.dao.PhysicalAbnormalMapperDAO;
import com.xjgx.physical.dto.AbnormalZbDTO;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PageMybatisIns;

@Service
public class PhysicalAbnormalService {
	
	@Resource
	private PhysicalAbnormalMapperDAO physicalAbnormalMapperDAO ;
	
	public List<AbnormalZbDTO> queryListTop10(String orgId, String startDate, String endDate) {
		return physicalAbnormalMapperDAO.queryListTop10(orgId, startDate, endDate) ;
	}
	
	public List<AbnormalZbDTO> queryItemList(String orgId, String startDate, String endDate, String itemCode) {
		return physicalAbnormalMapperDAO.queryItemList(orgId, startDate, endDate, itemCode) ;
	}
	
	public List<AbnormalZbDTO> querySexList(String orgId, String startDate, String endDate, String column) {
		return physicalAbnormalMapperDAO.querySexList(orgId, startDate, endDate, column) ;
	}
	
	public PageMybatis<AbnormalZbDTO> querySexTables(PageMybatis<Map<String, Object>> param) {
		return param.getData(new PageMybatisIns<AbnormalZbDTO, Map<String, Object>>() {
			@Override
			public void makeQuery(Map<String,Object> obj, String sortName, String sortOrder) {
				physicalAbnormalMapperDAO.querySexTables(obj);
			}
		});
	}
}
