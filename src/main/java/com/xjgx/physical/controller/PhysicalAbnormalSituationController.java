package com.xjgx.physical.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xjgx.domain.PhysicalAbnormalSituation;
import com.xjgx.physical.service.PhysicalAbnormalSituationService;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PhysicalUtils;
import com.xjgx.util.ResultDto;

@RestController
@RequestMapping("/phSituation")
public class PhysicalAbnormalSituationController {
	
	@Resource
	private PhysicalAbnormalSituationService physicalAbnormalSituationService ;
	
	/**
	 * @author xg
	 * @date 2018年3月26日-下午7:21:04
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     人群异常指标检出顺位
	 */
	@GetMapping("/queryAbnormalList")
	public ResultDto queryAbnormalList(String orgId, 
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
		/*column = PhysicalUtils.getColumn(column);
		if (StringUtils.isEmpty(column)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("未知人群类型") ;
			return result ;
		}*/
		Map<String, Object> datas = new HashMap<>() ;
		for(int i = 1;i <= 10 ; i++) {
			String col = PhysicalUtils.getColumn(String.valueOf(i)) ;
			datas.put(col, physicalAbnormalSituationService.queryAbnormalList(orgId, startDate, endDate, col)) ;
		}
		result.setResult(datas) ;
		return result ;
	}
	
	/**
	 * @author xg
	 * @date 2018年3月26日-下午7:20:51
	 * @param param
	 * @return 
	 * return ResultDto
	 * desc:
	 *     人群异常指标检出顺位(表格数据)
	 */
	@PostMapping("/queryAbnormalTables")
	public ResultDto queryAbnormalTables(@RequestBody PageMybatis<Map<String, Object>> param) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		result.setResult(physicalAbnormalSituationService.queryAbnormalTables(param)) ;
		return result ;
	}
	
	/**
	 * @author xg
	 * @date 2018年3月26日-下午7:20:34
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     机构异常指标检出顺位
	 */
	@GetMapping("/queryAbnormalByOrg")
	public ResultDto queryAbnormalByOrg(String orgId, 
			String startDate, String endDate) {
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
		List<PhysicalAbnormalSituation> pieDatas = physicalAbnormalSituationService.queryAbnormalByOrg(orgId, startDate, endDate) ;
		//List<PhysicalAbnormalSituation> tableDatas = physicalAbnormalSituationService.queryAbnormalByOrgTables(orgId, startDate, endDate) ;
		//Map<String, Object> datas = new HashMap<>() ;
		//datas.put("pies", pieDatas) ;
		//datas.put("tables", tableDatas) ;
		result.setResult(pieDatas) ;
		return result ;
	}
	
	@PostMapping("/queryAbnormalByOrgTables")
	public ResultDto queryAbnormalByOrgTables(@RequestBody PageMybatis<Map<String, Object>> param) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		result.setResult(physicalAbnormalSituationService.queryAbnormalByOrgTables(param)) ;
		return result ;
	}
	
}
