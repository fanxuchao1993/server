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
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PhysicalUtils;
import com.xjgx.util.ResultDto;

@RestController
@RequestMapping("/phAbnormalAge")
public class PhysicalAbnormalAgeController {
	
	@Resource
	private PhysicalAbnormalAgeService abnormalAgeService ;
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午4:18:05
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     查询年龄段图标数据
	 */
	@GetMapping("/queryAbnormalAgeList")
	public ResultDto queryAbnormalAgeList(String orgId, String startDate, String endDate) {
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
			datas.put(col, abnormalAgeService.queryAbnormalAgeList(orgId, startDate, endDate, col)) ;
		}
		result.setResult(datas) ;
		return result ;
	}
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午4:17:27
	 * @param param
	 * @return 
	 * return ResultDto
	 * desc:
	 *     查询年龄段指标数据
	 */
	@PostMapping("/queryAbnormalAgeTables")
	public ResultDto queryAbnormalAgeTables(@RequestBody PageMybatis<Map<String, Object>> param) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		result.setResult(abnormalAgeService.queryAbnormalAgeTables(param)) ;
		return result ;
	}
	
}
