package com.xjgx.physical.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.domain.PhysicalAbnormalAge;
import com.xjgx.domain.PhysicalDiseaseAge;

@Mapper
public interface PhysicalDiseaseAgeMapperDAO {
	
	/**
	 * @author fxc
	 * @date 2018年3月27日-早上10:30
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param column
	 * @return 
	 * return List<PhysicalDiseaseAge>
	 * desc:
	 *     根据不同的年龄段查询前10疾病的数据
	 */
	public List<PhysicalDiseaseAge> queryDiseaseAgeList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, 
			@Param("column") String column) ;
	
	/**
	 * @author fxc
	 * @date 2018年3月28日-中午12:00:00
	 * @param params
	 * @return 
	 * return List<PhysicalDiseaseAge>
	 * desc:
	 *     根据不同指标查询各个各个年龄段的量及汇总
	 */
	public List<PhysicalDiseaseAge> queryDiseaseAgeTables(Map<String, Object> params) ;
	
}
