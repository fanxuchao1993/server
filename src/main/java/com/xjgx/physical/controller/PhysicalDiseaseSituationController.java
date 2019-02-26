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
import com.xjgx.physical.service.PhysicalDiseaseSituationService;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PhysicalUtils;
import com.xjgx.util.ResultDto;

@RestController
@RequestMapping("/phDiseaseSituation")
public class PhysicalDiseaseSituationController {
	
	@Resource
	private PhysicalDiseaseSituationService physicalDiseaseSituationService ;
	
	/**
		 * @author fxc
		 * @date   2018-03-27 10:40
		 * @param  orgId
		 * @param  startDate
		 * @param  endDate
		 * @return ResultDto
		 * desc:
		 *     根据人群的种类查出排行前十的疾病的总数 
	*/
	@GetMapping("/queryDiseaseSituationByGrpList")
	public ResultDto queryDiseaseSituationByGrpList(String orgId, 
			String startDate, String endDate/*, String column*/) {
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
		for(int i = 1;i <= 10 ; i++) {
			String col = PhysicalUtils.getColumn(String.valueOf(i)) ;
			datas.put(col, physicalDiseaseSituationService.queryDiseaseSituationByGrpList(orgId, startDate, endDate, col)) ;
		}
		result.setResult(datas) ;
		return result ;
	}
	
	/**
		 * @author fxc
		 * @date   2018-03-27 10:40
		 * @param  PageMybatis<Map<String, Object>> param
		 * @return ResultDto
		 * desc:
		 *     查询各类人群患各类疾病的比率，查询结果分页展示
	*/
	@PostMapping("/queryDiseaseSituationByGrpTables")
	public ResultDto queryDiseaseSituationByGrpTables(@RequestBody PageMybatis<Map<String, Object>> param) {
		System.out.println(param) ;
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		result.setResult(physicalDiseaseSituationService.queryDiseaseSituationByGrpTables(param)) ;
		return result ;
	}
	
	/**
	 * @author fxc
	 * @date   2018-03-27 10:40
	 * @param  orgId
	 * @param  startDate
	 * @param  endDate
	 * @return ResultDto
	 * desc:
	 *     根据机构的种类查出排行前十的疾病的总数
*/
@GetMapping("/queryDiseaseSituationByOrgList")
public ResultDto queryDiseaseSituationByOrgList(String orgId, 
		String startDate, String endDate/*, String column*/) {
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
	for(int i = 1;i <= 10 ; i++) {
		String col = PhysicalUtils.getColumn(String.valueOf(i)) ;
		datas.put(col, physicalDiseaseSituationService.queryDiseaseSituationByOrgList(orgId, startDate, endDate, col)) ;
	}
	result.setResult(datas) ;
	return result ;
}

/**
	 * @author fxc
	 * @date   2018-03-27 10:40
	 * @param  PageMybatis<Map<String, Object>> param
	 * @return ResultDto
	 * desc:
	 *     查询各个机构患各类疾病的比率，查询结果分页展示
*/
@PostMapping("/queryDiseaseSituationByOrgTables")
public ResultDto queryDiseaseSituationByOrgTables(@RequestBody PageMybatis<Map<String, Object>> param) {
	System.out.println(param) ;
	ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
	result.setResult(physicalDiseaseSituationService.queryDiseaseSituationByOrgTables(param)) ;
	return result ;
}
	
}
