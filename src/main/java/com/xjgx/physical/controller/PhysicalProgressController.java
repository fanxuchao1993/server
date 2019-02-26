package com.xjgx.physical.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xjgx.domain.PhysicalProgress;
import com.xjgx.physical.service.PhysicalProgressService;
import com.xjgx.util.ResultDto;

/**
 * @author xg
 * @date 2018年3月20日-下午3:12:50
 * desc: 
 *     机构体检进度<br/>
 *     所有接口返回统一对象ResultDto；code: 0 成功；code: -1(非零数字) 失败
 */
@RestController
@RequestMapping("/phProgress")
public class PhysicalProgressController {
	
	@Resource
	private PhysicalProgressService physicalProgressService ;
	
	@GetMapping("/queryList")
	public ResultDto queryList(String orgId, String physicalDate) {
		ResultDto result = new ResultDto() ;
		if (StringUtils.isEmpty(orgId)) {
			result.setMessage("机构不能为空") ;
			return result ;
		}
		List<PhysicalProgress> list = physicalProgressService.queryList(orgId, physicalDate) ;
		result.setCode(ResultDto.CODE_SUCCESS) ;
		result.setMessage("查询成功") ;
		result.setResult(list) ;
		return result ;
	}
	
	@GetMapping("/queryListByMonthSum")
	public ResultDto queryListByMonthSum(String orgId, int year) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(orgId)) {
			result.setMessage("机构不能为空") ;
			return result ;
		}
		result.setResult(physicalProgressService.queryListByMonthSum(orgId, year)) ;
		return result ;
	}
	
}
