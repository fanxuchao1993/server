package com.xjgx.physical.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xjgx.physical.dto.PhysicalSummaryDTO;
import com.xjgx.physical.service.PhysicalCompleteService;
import com.xjgx.util.PhysicalUtils;
import com.xjgx.util.ResultDto;

/**
 * @author xg
 * @date 2018年3月20日-下午3:12:50
 * desc: 
 *     体检完成情况<br/>
 *     所有接口返回统一对象ResultDto；code: 0 成功；code: -1(非零数字) 失败
 */
@RestController
@RequestMapping("/phComplete")
public class PhysicalCompleteController {
	
	@Resource
	private PhysicalCompleteService physicalCompleteService ;
	
	@GetMapping("/queryList")
	public ResultDto queryList(String orgId, String startDate, String endDate, int cyear) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(orgId)) {
			result.setMessage("机构不能为空") ;
			return result ;
		}
		if (StringUtils.isEmpty(startDate) || StringUtils.isEmpty(endDate)) {
			result.setMessage("日期不能为空") ;
			return result ;
		}
		if (!PhysicalUtils.isValidDate(startDate) || !PhysicalUtils.isValidDate(endDate)) {
			result.setMessage("非法日期") ;
			return result ;
		}
		List<PhysicalSummaryDTO> list = physicalCompleteService.queryList(orgId, startDate, endDate, cyear) ;
		result.setResult(list) ;
		return result ;
	}
	
}
