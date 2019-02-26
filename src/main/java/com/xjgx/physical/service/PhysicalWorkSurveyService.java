package com.xjgx.physical.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjgx.domain.PhysicalComplete;
import com.xjgx.domain.PhysicalDisease;
import com.xjgx.physical.dao.PhysicalCompleteMapperDAO;
import com.xjgx.physical.dao.PhysicalWorkSurveyMapperDAO;
import com.xjgx.physical.dto.MyEntityDTO;
import com.xjgx.physical.dto.PhysicalSummaryDTO;
import com.xjgx.physical.dto.PhysicalWorkSurveyDTO;
import com.xjgx.physical.repository.PhysicalCompleteRepository;

@Service
public class PhysicalWorkSurveyService {
	
	@Resource
	private PhysicalCompleteRepository physicalCompleteRepository ;
	
	@Resource
	private PhysicalWorkSurveyMapperDAO physicalWorkSurveyMapperDAO ;
	
	/**
	 * 
	 * @author pck
	 * @date 2018年3月27日
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param cyear
	 * @return
	 * desc 查询工作量概览数据
	 */
	public List<PhysicalWorkSurveyDTO> queryList(String orgId, String startDate, String endDate, int cyear) {
		return physicalWorkSurveyMapperDAO.queryCountOne(orgId, startDate, endDate,  cyear);
	}
	/**
	 * 
	 * @author pck
	 * @date 2018年3月27日
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param cyear
	 * @return
	 * desc 查询工作量区划分布体检完成数据
	 */
	public List<PhysicalWorkSurveyDTO> queryOrgOne(String pOrgId, String startDate, String endDate) {
		return physicalWorkSurveyMapperDAO.queryOrgOne(pOrgId, startDate, endDate);
	}
	
	/**
	 * 
	 * @author pck
	 * @date 2018年3月27日
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param cyear
	 * @return
	 * desc 查询工作量区划分布每个机构前十疾病数据
	 */
	public List<PhysicalWorkSurveyDTO> queryOrgTwo(String orgId, String startDate, String endDate) {
		System.out.println("进入2");
		return physicalWorkSurveyMapperDAO.queryOrgTwo(orgId, startDate, endDate);
	}
	public List<PhysicalComplete> queryOrgList(String pOrgId, String startDate, String endDate){
		return physicalWorkSurveyMapperDAO.queryOrgList(pOrgId,startDate,endDate);
	}
	
	public List<PhysicalDisease> queryDiseaseByPorg(String pOrgId, String startDate, String endDate)
	{
		return physicalWorkSurveyMapperDAO.queryDiseaseByPorg(pOrgId,startDate,endDate);
	}
	
	public List<MyEntityDTO> queryDiseaseByOrg(String startDate, String endDate,List<PhysicalDisease> list,String pOrgId)
	{
		return physicalWorkSurveyMapperDAO.queryDiseaseByOrg(startDate,endDate,list,pOrgId);
	}
}
