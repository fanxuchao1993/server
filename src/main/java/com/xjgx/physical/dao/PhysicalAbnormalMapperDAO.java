package com.xjgx.physical.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.domain.PhysicalAbnormalAge;
import com.xjgx.physical.dto.AbnormalZbDTO;

@Mapper
public interface PhysicalAbnormalMapperDAO {
	
	/**
	 * @author xg
	 * @date 2018年3月23日-上午11:21:08
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return List<AbnormalZbDTO>
	 * desc:
	 *     排名前十异常指标
	 */
	List<AbnormalZbDTO> queryListTop10(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate) ;
	
	/**
	 * @author xg
	 * @date 2018年3月23日-上午11:22:21
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param itemCode
	 * @return 
	 * return List<AbnormalZbDTO>
	 * desc:
	 *     根据指标查询各机构检出构成
	 */
	List<AbnormalZbDTO> queryItemList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, 
			@Param("itemCode") String itemCode) ;
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午6:00:18
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return List<AbnormalZbDTO>
	 * desc:
	 *     性别异常指标检出顺位(图表)
	 */
	List<AbnormalZbDTO> querySexList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("column") String column) ;
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午6:03:16
	 * @param params
	 * @return 
	 * return List<AbnormalZbDTO>
	 * desc:
	 *     性别异常指标检出顺位(表格数据)
	 */
	public List<AbnormalZbDTO> querySexTables(Map<String, Object> params) ;
	
}
