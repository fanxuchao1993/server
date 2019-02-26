package com.xjgx.physical.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.physical.dto.PhysicalSummaryDTO;

@Mapper
public interface PhysicalCompleteMapperDAO {
	
	/**
	 * @author xg
	 * @date 2018年3月22日-上午10:52:37
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param year
	 * @return 
	 * return List<PhysicalSummaryDTO>
	 * desc:
	 *     时间段内查询机构体检完成情况
	 */
	List<PhysicalSummaryDTO> queryList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, 
			@Param("endDate") String endDate, 
			@Param("cyear") int year) ;
	
}
