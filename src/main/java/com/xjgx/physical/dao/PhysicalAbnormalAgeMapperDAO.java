package com.xjgx.physical.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.domain.PhysicalAbnormalAge;

@Mapper
public interface PhysicalAbnormalAgeMapperDAO {
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午3:56:13
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param column
	 * @return 
	 * return List<PhysicalAbnormalAge>
	 * desc:
	 *     根据不同的年龄段查询前10指标的数据
	 */
	public List<PhysicalAbnormalAge> queryAbnormalAgeList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, 
			@Param("column") String column) ;
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午3:56:32
	 * @param params
	 * @return 
	 * return List<PhysicalAbnormalAge>
	 * desc:
	 *     根据不同指标查询各个各个年龄段的量及汇总
	 */
	public List<PhysicalAbnormalAge> queryAbnormalAgeTables(Map<String, Object> params) ;
	
}
