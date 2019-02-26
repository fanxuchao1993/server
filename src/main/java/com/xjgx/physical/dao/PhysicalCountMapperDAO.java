package com.xjgx.physical.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.xjgx.domain.PhysicalProgress;
import com.xjgx.physical.dto.PhysicalCountDTO;

@Mapper
public interface PhysicalCountMapperDAO {
	/**
	 * @author  fxc
	 * @date    2018-03-23 18:30
	 * @param   pOrgId 
	 * @return  PhysicalCountDTO
	 * desc: 体检工作概述
	 *     
    */
	PhysicalCountDTO queryCountOne(PhysicalCountDTO physicalCount) ;
	
	/**
	 * @author fxc
	 * @date   2018-03-23 18:30
	 * @param  pOrgId
	 * @return List<PhysicalCountDTO>
	 * desc:
	 *       摘要
     */
	List<PhysicalCountDTO> queryCountTwo(PhysicalCountDTO physicalCount) ;
	
	/**
	 * @author fxc
	 * @date   2018-03-23 19:00
	 * @param  pOrgId
	 * @return List<PhysicalCountDTO>
	 * desc:  
	 *        体检工作开展趋势 
    */
	List<PhysicalCountDTO> queryCountThree(PhysicalCountDTO physicalCount) ;
}
