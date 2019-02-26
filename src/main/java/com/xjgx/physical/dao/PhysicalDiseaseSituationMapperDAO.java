package com.xjgx.physical.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.xjgx.domain.PhysicalDiseaseSituation;

@Mapper
public interface PhysicalDiseaseSituationMapperDAO {
	
	/**
	 * @author fxc
	 * @date 2018年3月26日-晚上21:00
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param column
	 * @return 
	 * return List<PhysicalDiseaseSituation>
	 * desc:
	 *     根据不同的人群查询前10疾病的总数
	 */
	public List<PhysicalDiseaseSituation> queryDiseaseSituationByGrpList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, 
			@Param("column") String column) ;
	
	/**
	 * @author fxc
	 * @date 2018年3月26日-晚上21:10
	 * @param params
	 * @return 
	 * return List<PhysicalAbnormalSituation>
	 * desc:
	 *     查询各类人群患不同疾病的总数
	 */
	public List<PhysicalDiseaseSituation> queryDiseaseSituationByGrpTables(Map<String, Object> params) ;
	
	/**
	 * @author fxc
	 * @date   2018年3月27日-早上11:00
	 * @param  orgId
	 * @param  startDate
	 * @param  endDate
	 * @param  column
	 * @return 
	 * return List<PhysicalDiseaseSituation>
	 * desc:
	 *     根据不同的机构查询前10疾病的总数
	 */
	public List<PhysicalDiseaseSituation> queryDiseaseSituationByOrgList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, 
			@Param("column") String column) ;
	
	/**
	 * @author fxc
	 * @date 2018年3月28日-晚上21:10
	 * @param params
	 * @return 
	 * return List<PhysicalAbnormalSituation>
	 * desc:
	 *     查询各类机构群患不同疾病的总数
	 */
	public List<PhysicalDiseaseSituation> queryDiseaseSituationByOrgTables(Map<String, Object> params) ;
	
	
}
