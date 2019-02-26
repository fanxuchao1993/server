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

import com.xjgx.physical.service.PhysicalAbnormalService;
import com.xjgx.physical.service.PhysicalDiseaseService;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.ResultDto;

@RestController
@RequestMapping("/phAbnormal")
public class PhysicalAbnormalController {
	
	@Resource
	private PhysicalAbnormalService physicalAbnormalService ;
	@Resource
	private PhysicalDiseaseService physicalDiseaseService ;
	
	/**
	 * @author xg
	 * @date 2018年3月23日-上午11:44:31
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     前十异常指标
	 */
	@GetMapping("/index")
	public ResultDto index(String orgId, String startDate, String endDate) {
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
		datas.put("indexTop10", physicalAbnormalService.queryListTop10(orgId, startDate, endDate)) ;
		datas.put("diseaseTop10", physicalDiseaseService.queryListTop10(orgId, startDate, endDate)) ;
		result.setResult(datas) ;
		return result ;
	}
	
	/**
	 * @author xg
	 * @date 2018年3月23日-下午1:57:10
	 * @param itemCode
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     根据指标查询机构对应的数据
	 */
	@GetMapping("/queryIndexOrg")
	public ResultDto queryIndexOrg(String itemCode, String orgId, String startDate, String endDate) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(itemCode)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("指标不能为空") ;
			return result ;
		}
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
		result.setResult(physicalAbnormalService.queryItemList(orgId, startDate, endDate, itemCode)) ;
		return result ;
	}
	
	/**
	 * @author xg
	 * @date 2018年3月23日-下午3:11:31
	 * @param itemCode
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     根据疾病统计机构情况
	 */
	@GetMapping("/queryDiseaseOrg")
	public ResultDto queryDiseaseOrg(String diseaseCode, String orgId, String startDate, String endDate) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(diseaseCode)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("疾病不能为空") ;
			return result ;
		}
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
		result.setResult(physicalDiseaseService.queryDiseaseList(orgId, startDate, endDate, diseaseCode)) ;
		return result ;
	}
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午6:15:15
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     性别异常指标检出顺位(图表)
	 */
	@GetMapping("/querySexList")
	public ResultDto querySexList(String orgId, String startDate, String endDate) {
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
		datas.put("MN", physicalAbnormalService.querySexList(orgId, startDate, endDate, "MAN_NUM")) ;
		datas.put("WN", physicalAbnormalService.querySexList(orgId, startDate, endDate, "WOMAN_NUM")) ;
		result.setResult(datas) ;
		return result ;
	}
	
	/**
	 * @author xg
	 * @date 2018年3月27日-下午6:15:00
	 * @param param
	 * @return 
	 * return ResultDto
	 * desc:
	 *     性别异常指标检出顺位(表格数据)
	 */
	@PostMapping("/querySexTables")
	public ResultDto querySexTables(@RequestBody PageMybatis<Map<String, Object>> param) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		result.setResult(physicalAbnormalService.querySexTables(param)) ;
		return result ;
	}
	
}
