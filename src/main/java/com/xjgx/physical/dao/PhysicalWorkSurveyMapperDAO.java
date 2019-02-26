package com.xjgx.physical.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.domain.PhysicalComplete;
import com.xjgx.domain.PhysicalDisease;
import com.xjgx.domain.PhysicalProgress;
import com.xjgx.physical.dto.MyEntityDTO;
import com.xjgx.physical.dto.PhysicalCountDTO;
import com.xjgx.physical.dto.PhysicalWorkSurveyDTO;

/**
 * 
 * @author 庞朝款
 * @date 2018年3月27日
 * @param 
 * @return 
 * desc
 */
@Mapper
public interface PhysicalWorkSurveyMapperDAO {
	
	
	/**
	 * 
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param year
	 * @return
	 *  desc：查询工作量概览数据
	 */
	List<PhysicalWorkSurveyDTO> queryCountOne(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, 
			@Param("endDate") String endDate,
			@Param("cyear") int year) ;
	/**
	 * 
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param year
	 * @return
	 * desc：查询工作量区划分布体检完成数据
	 */
	List<PhysicalWorkSurveyDTO> queryOrgOne(@Param("pOrgId") String pOrgId, 
			@Param("startDate") String startDate, 
			@Param("endDate") String endDate) ;
	
	/**
	 * 
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param year
	 * @return
	 * desc：查询工作量区划分布每个机构前十疾病数据
	 */
	List<PhysicalWorkSurveyDTO> queryOrgTwo(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, 
			@Param("endDate") String endDate) ;
	/**
	 * 
	 * @author fxc
	 * @date 2018年3月29日 15:40
	 * @param pOrgId
	 * @param startDate
	 * @param endDate
	 * @return
	 * desc 
	 *    查询已经完成体检的机构
	 * 
	 */
	List<PhysicalComplete> queryOrgList(@Param("pOrgId") String orgId, 
			@Param("startDate") String startDate, 
			@Param("endDate") String endDate);
	
	List<PhysicalDisease>queryDiseaseByPorg(@Param("pOrgId") String pOrgId, 
			@Param("startDate") String startDate, 
			@Param("endDate") String endDate);
	
	List<MyEntityDTO> queryDiseaseByOrg(@Param("startDate") String startDate, @Param("endDate") String endDate,@Param("diseaseCodes") List<PhysicalDisease> diseaseCodes,@Param("pOrgId") String pOrgId);
}
