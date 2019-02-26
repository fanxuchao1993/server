package com.xjgx.physical.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.domain.PhysicalProgress;

@Mapper
public interface PhysicalProgressMapperDAO {
	
	/**
	 * @author xg
	 * @date 2018年3月28日-下午6:30:50
	 * @param orgId
	 * @param physicalDate
	 * @return 
	 * return List<PhysicalProgress>
	 * desc:
	 *     根据机构编码，体检日期查询结果列表
	 */
	List<PhysicalProgress> queryList(@Param("orgId") String orgId, 
			@Param("physicalDate") String physicalDate) ;
	
	/**
	 * @author xg
	 * @date 2018年3月28日-下午6:31:49
	 * @param orgId
	 * @param year
	 * @return 
	 * return List<PhysicalProgress>
	 * desc:
	 *     按月统计每个机构提交完成情况
	 */
	List<PhysicalProgress> queryListByMonthSum(@Param("orgId") String orgId, 
			@Param("year") int year) ;
	
}
