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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xjgx.domain.PhysicalComplete;
import com.xjgx.domain.PhysicalDisease;
import com.xjgx.domain.base.BaseEntity;
import com.xjgx.physical.dto.DiseaseByOrgDTO;
import com.xjgx.physical.dto.MyEntityDTO;
import com.xjgx.physical.dto.PhysicalSummaryDTO;
import com.xjgx.physical.dto.PhysicalWorkSurveyDTO;
import com.xjgx.physical.service.PhysicalCompleteService;
import com.xjgx.physical.service.PhysicalWorkSurveyService;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PhysicalUtils;
import com.xjgx.util.ResultDto;

/**
 * @author xg
 * @date 2018年3月20日-下午3:12:50
 * desc: 
 *     工作量功能<br/>
 *     所有接口返回统一对象ResultDto；code: 0 成功；code: -1(非零数字) 失败
 */
@RestController
@RequestMapping("workSurvey")
public class PhysicalWorkSurveyController {
	
	@Resource
	private PhysicalWorkSurveyService physicalWorkSurveyService ;
	/**
	 * 
	 * @author pck
	 * @date 2018年3月27日
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param cyear
	 * @return
	 * desc 
	 *    工作量摘要数据查询
	 */
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
		List<PhysicalWorkSurveyDTO> list = physicalWorkSurveyService.queryList(orgId, startDate, endDate,cyear) ;
		result.setResult(list) ;
		return result ;
	}
	
	/**
	 * 
	 * @author pck
	 * @date 2018年3月27日
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param cyear
	 * @return
	 * desc 
	 * @modifyDate 2018-03-29
	 * @author     fxc
	 *     工作量区划分布体检完成数据查询
	 */
	@GetMapping("/queryOrgOne")
	public ResultDto queryOrgOne(String pOrgId, String startDate, String endDate) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(pOrgId)) {
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
		List<PhysicalWorkSurveyDTO> list = physicalWorkSurveyService.queryOrgOne(pOrgId, startDate, endDate) ;
		result.setResult(list) ;
		return result ;
	}
	/**
	 * 
	 * @author pck
	 * @date 2018年3月27日
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return
	 * desc 
	 *    工作量每个机构疾病前十数据查询
	 * 
	 */
	@GetMapping("/queryOrgTwo")
	public ResultDto queryOrgTwo(String orgId, String startDate, String endDate) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
//		if (StringUtils.isEmpty(orgId)) {
//			result.setMessage("机构不能为空") ;
//			return result ;
//		}
//		if (StringUtils.isEmpty(startDate) || StringUtils.isEmpty(endDate)) {
//			result.setMessage("日期不能为空") ;
//			return result ;
//		}
//		if (!PhysicalUtils.isValidDate(startDate) || !PhysicalUtils.isValidDate(endDate)) {
//			result.setMessage("非法日期") ;
//			return result ;
//		}
		List<PhysicalWorkSurveyDTO> list = physicalWorkSurveyService.queryOrgTwo(orgId, startDate, endDate) ;
		result.setResult(list) ;
		System.out.println("进入1");
		return result ;
	}
	
	/**
	 * 
	 * @author fxc
	 * @date 2018年3月29日 15:40
	 * @param pOrgId
	 * @param startDate
	 * @param endDate
	 * @return
	 * desc 
	 *    查询已经完成体检的机构
	 * 
	 */
	@GetMapping("/queryOrgList")
	public ResultDto queryOrgList(String pOrgId, String startDate, String endDate) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(pOrgId)) {
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
		List<PhysicalComplete> list = physicalWorkSurveyService.queryOrgList(pOrgId, startDate, endDate) ;
		result.setResult(list) ;
		System.out.println("进入1");
		return result ;
	}
	/**
	 * @author fxc
	 * @date 2018年3月29日-下午 15:23
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return ResultDto
	 * desc:
	 *     查询每个机构每种疾病的总数 
	 */
	@PostMapping("/queryDiseaseByOrg")
	public ResultDto queryDiseaseByOrg(@RequestBody MyEntityDTO param) {
		System.out.println(param);
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(param)) {
			result.setCode(ResultDto.CODE_FAIL) ;
			result.setMessage("参数不能为空") ;
			return result ;
		}
		String startDate = param.getStartDate();
		String endDate = param.getEndDate();
		List<PhysicalDisease> list = param.getDiseaseCodes();
		String pOrgId = param.getpOrgId();
		List<MyEntityDTO>  myEntity = physicalWorkSurveyService.queryDiseaseByOrg(startDate,endDate,list,pOrgId);
		result.setCode(ResultDto.CODE_SUCCESS);
		result.setMessage("成功 ");
		result.setResult(myEntity);
		System.out.println("------------------------------------");
		System.out.println(myEntity);
		return result ;
	}
	
	@GetMapping("/queryDiseaseByPorg")
	public ResultDto queryDiseaseByPorg(String pOrgId, String startDate, String endDate) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		if (StringUtils.isEmpty(pOrgId)) {
			result.setMessage("机构不能为空") ;
			return result ;
		}
		if (StringUtils.isEmpty(startDate) || StringUtils.isEmpty(endDate)) {
			result.setMessage("日期不能为空") ;
			return result ;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<PhysicalDisease> list = physicalWorkSurveyService.queryDiseaseByPorg(pOrgId, startDate, endDate) ;
		result.setCode(ResultDto.CODE_SUCCESS);
		result.setMessage("成功 ");
		result.setResult(list);
		return result;
	}
}
