package com.xjgx.physical.controller;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xjgx.domain.PhysicalProgress;
import com.xjgx.physical.dto.PhysicalCountDTO;
import com.xjgx.physical.service.PhysicalCountService;
import com.xjgx.physical.service.PhysicalProgressService;
import com.xjgx.util.ResultDto;

@RestController
@RequestMapping("/phCount")
public class PhysicalCountController {
	
	@Resource
	private PhysicalCountService physicalCountService ;
	
	/**
	 * @author  fxc
	 * @date    2018-03-23 18:30
	 * @param   pOrgId 
	 * @return  ResultDto
	 * desc: 体检工作概述
	 *     
    */
	@GetMapping("/queryCountOne")
	public ResultDto queryCountOne(String pOrgId) {
		ResultDto result = new ResultDto() ;
		if (StringUtils.isEmpty(pOrgId)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("机构不能为空") ;
			return result ;
		}
		PhysicalCountDTO physicalCountOne=new PhysicalCountDTO();
		physicalCountOne.setpOrgId(pOrgId);
		PhysicalCountDTO physicalCountTwo = physicalCountService.queryCountOne(physicalCountOne) ;
		result.setCode(ResultDto.CODE_SUCCESS) ;
		result.setMessage("查询成功") ;
		result.setResult(physicalCountTwo) ;
		return result ;
	}
	
	/**
	 * @author fxc
	 * @date   2018-03-23 18:30
	 * @param  pOrgId
	 * @return ResultDto
	 * desc:
	 *       摘要
     */
	@GetMapping("/queryCountTwo")
	public ResultDto queryCountTwo(String pOrgId) {
		ResultDto result = new ResultDto() ;
		if (StringUtils.isEmpty(pOrgId)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("机构不能为空") ;
			return result ;
		}
		PhysicalCountDTO physicalCount=new PhysicalCountDTO();
		physicalCount.setpOrgId(pOrgId);
		List<PhysicalCountDTO> physicalCountList = physicalCountService.queryCountTwo(physicalCount) ;
		result.setCode(ResultDto.CODE_SUCCESS) ;
		result.setMessage("查询成功") ;
		result.setResult(physicalCountList) ;
		return result ;
	}
	
	/**
	 * @author fxc
	 * @date   2018-03-23 19:00
	 * @param  pOrgId
	 * @return ResultDto
	 * desc:  
	 *        体检工作开展趋势 
    */
	@GetMapping("/queryCountThree")
	public ResultDto queryCountThree(String pOrgId) {
		ResultDto result = new ResultDto() ;
		if (StringUtils.isEmpty(pOrgId)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("机构不能为空") ;
			return result ;
		}
		PhysicalCountDTO physicalCount=new PhysicalCountDTO();
		physicalCount.setpOrgId(pOrgId);
		List<PhysicalCountDTO> physicalCountList = physicalCountService.queryCountThree(physicalCount) ;
		result.setCode(ResultDto.CODE_SUCCESS) ;
		result.setMessage("查询成功") ;
		result.setResult(physicalCountList) ;
		return result ;
	}
	
}
