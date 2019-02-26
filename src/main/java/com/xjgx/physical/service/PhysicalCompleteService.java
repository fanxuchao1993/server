package com.xjgx.physical.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xjgx.physical.dao.PhysicalCompleteMapperDAO;
import com.xjgx.physical.dto.PhysicalSummaryDTO;
import com.xjgx.physical.repository.PhysicalCompleteRepository;

@Service
public class PhysicalCompleteService {
	
	@Resource
	private PhysicalCompleteRepository physicalCompleteRepository ;
	
	@Resource
	private PhysicalCompleteMapperDAO physicalCompleteMapperDAO ;
	
	/**
	 * @author xg
	 * @date 2018年3月21日-下午5:57:49
	 * @param orgId
	 * @param completeDate
	 * @param cyear
	 * @return 
	 * return List<PhysicalSummaryDTO>
	 * desc:
	 *     查询机构体检完成情况
	 */
	public List<PhysicalSummaryDTO> queryList(String orgId, String startDate, String endDate, int cyear) {
		return physicalCompleteMapperDAO.queryList(orgId, startDate, endDate, cyear) ;
	}
	
}
