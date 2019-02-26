package com.xjgx.physical.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xjgx.physical.service.PhysicalAbnormalAgeService;
import com.xjgx.physical.service.PhysicalDiseaseAgeService;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PhysicalUtils;
import com.xjgx.util.ResultDto;

@RestController
@RequestMapping("/phDiseaseAge")
public class PhysicalDiseaseAgeController {
	
	@Resource
	private PhysicalDiseaseAgeService diseaseAgeService ;
	
	/**
	 * @author fxc
	 * @date 2018年3月28日-早上 10:20
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     查询年龄段图标数据
	 */
	@GetMapping("/queryDiseaseAgeList")
	public ResultDto queryDiseaseAgeList(String orgId, String startDate, String endDate) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(orgId)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("机构不能为空") ;
			return result ;
		}
		if (StringUtils.isEmpty(startDate) || StringUtils.isEmpty(endDate)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("日期不能为空") ;
			return result ;
		}
		Map<String, Object> datas = new HashMap<>() ;
		for(int i = 1;i <= 8 ; i++) {
			String col = PhysicalUtils.getAgeColumn(String.valueOf(i)) ;
			datas.put(col, diseaseAgeService.queryDiseaseAgeList(orgId, startDate, endDate, col)) ;
		}
		result.setResult(datas) ;
		return result ;
	}
	
	/**
	 * @author fxc
	 * @date 2018年3月28日-中午12:00:00
	 * @param param
	 * @return 
	 * return ResultDto
	 * desc:
	 *     查询年龄段指标数据
	 */
	@PostMapping("/queryDiseaseAgeTables")
	public ResultDto queryAbnormalAgeTables(@RequestBody PageMybatis<Map<String, Object>> param) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		result.setResult(diseaseAgeService.queryDiseaseAgeTables(param)) ;
		return result ;
	}
	
}
