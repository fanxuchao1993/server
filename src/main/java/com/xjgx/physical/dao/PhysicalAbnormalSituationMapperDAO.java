package com.xjgx.physical.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.domain.PhysicalAbnormalSituation;

@Mapper
public interface PhysicalAbnormalSituationMapperDAO {
	
	/**
	 * @author xg
	 * @date 2018年3月23日-下午5:44:22
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param column
	 * @return 
	 * return List<PhysicalAbnormalSituation>
	 * desc:
	 *     根据不同的人群查询前10指标的数据
	 */
	public List<PhysicalAbnormalSituation> queryAbnormalList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, 
			@Param("column") String column) ;
	
	/**
	 * @author xg
	 * @date 2018年3月26日-下午12:47:36
	 * @param params
	 * @return 
	 * return List<PhysicalAbnormalSituation>
	 * desc:
	 *     根据不同指标查询各个人群的量及汇总
	 */
	public List<PhysicalAbnormalSituation> queryAbnormalTables(Map<String, Object> params) ;
	
	/**
	 * @author xg
	 * @date 2018年3月26日-下午7:14:16
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return List<PhysicalAbnormalSituation>
	 * desc:
	 *     查询指标排前5的各个机构占比
	 */
	public List<PhysicalAbnormalSituation> queryAbnormalByOrg(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate) ;
	
	/**
	 * @author xg
	 * @date 2018年3月27日-上午11:40:36
	 * @param params
	 * @return 
	 * return List<PhysicalAbnormalSituation>
	 * desc:
	 *     机构异常指标检出顺位(表格数据)
	 */
	public List<PhysicalAbnormalSituation> queryAbnormalByOrgTables(Map<String, Object> params) ;
}
