package com.xjgx.physical.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.xjgx.physical.dao.PhysicalCountMapperDAO;
import com.xjgx.physical.dto.PhysicalCountDTO;
@Service
public class PhysicalCountService {

	/**
	 * @author fxc
	 * @date 
	 * desc 
	 *     
	 */
	
	@Resource
	private PhysicalCountMapperDAO physicalCountMapperDAO ;
	
	public PhysicalCountDTO queryCountOne(PhysicalCountDTO physicalCount) {
		return physicalCountMapperDAO.queryCountOne(physicalCount) ;
	}
	
	public List<PhysicalCountDTO> queryCountTwo(PhysicalCountDTO physicalCount) {
		return physicalCountMapperDAO.queryCountTwo(physicalCount) ;
	}
	
	public List<PhysicalCountDTO> queryCountThree(PhysicalCountDTO physicalCount) {
		return physicalCountMapperDAO.queryCountThree(physicalCount) ;
	}
}
