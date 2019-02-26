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

import com.xjgx.domain.PhysicalDisease;
import com.xjgx.physical.service.PhysicalDiseaseService;
import com.xjgx.util.PageMybatis;
import com.xjgx.util.PhysicalUtils;
import com.xjgx.util.ResultDto;

/**
 * @author xg
 * @date 2018年3月20日-下午3:12:50
 * desc: 
 *     体检疾病情况<br/>
 *     所有接口返回统一对象ResultDto；code: 0 成功；code: -1(非零数字) 失败
 */
@RestController
@RequestMapping("/phDisease")
public class PhysicalDiseaseController {

	@Resource
	private PhysicalDiseaseService physicalDiseaseService ;
	
	/**
	 * @author fxc
	 * @date   pOrgId   
	 * @param  orgName
	 * @return ResultDto
	 * desc:
	 *     查询排名前十个的疾病总数。
    */
	@GetMapping("/queryDiseaseList")
	public ResultDto queryDiseaseList(String pOrgId,String orgName) {
		ResultDto result = new ResultDto() ;
		List<PhysicalDisease> list = physicalDiseaseService.queryDiseaseListFan(pOrgId,orgName) ;
		result.setCode(ResultDto.CODE_SUCCESS); 
		result.setMessage("查询成功") ;
		result.setResult(list) ;
		return result ;
	}
	
	/**
	 * @author fxc
	 * @date   orgId   
	 * @param  startDate
	 * @param  endDate
	 * @return ResultDto
	 * desc:
	 *     查询患病的人所属的下级机构(下拉显示)。
    */
	@GetMapping("/queryOrgByDiseaseList")
	public ResultDto queryOrgByDiseaseList(String orgId, String startDate, String endDate) {
		ResultDto result = new ResultDto();
		if (StringUtils.isEmpty(orgId)) {
			result.setCode(ResultDto.CODE_FAIL);
			result.setMessage("机构不能为空");
			return result;
		}
		if (StringUtils.isEmpty(startDate) || StringUtils.isEmpty(endDate)) {
			result.setCode(ResultDto.CODE_FAIL);
			result.setMessage("日期不能为空");
			return result;
		}
		List<PhysicalDisease> list = physicalDiseaseService.queryOrgByDiseaseList(orgId, startDate, endDate);
		result.setCode(ResultDto.CODE_SUCCESS);
		result.setMessage("查询成功");
		result.setResult(list);
		return result;
	}
    
	/**
	 * @author fxc
	 * @date   2018-03-27 早上9:00
	 * @param  orgId   
	 * @param  startDate
	 * @param  endDate
	 * @return ResultDto
	 * desc:
	 *     查询每一个机构排名前十的10种疾病，并且查出每一种疾病的总数。这个org_id指的是表中的org_id
	*/
	@GetMapping("/queryListTop10ByOrg")
	public ResultDto queryListTop10ByOrg(String orgId, String startDate, String endDate) {
		ResultDto result = new ResultDto();
		if (StringUtils.isEmpty(orgId)) {
			result.setCode(ResultDto.CODE_FAIL);
			result.setMessage("机构不能为空");
			return result;
		}
		if (StringUtils.isEmpty(startDate) || StringUtils.isEmpty(endDate)) {
			result.setCode(ResultDto.CODE_FAIL);
			result.setMessage("日期不能为空");
			return result;
		}
		List<PhysicalDisease> list = physicalDiseaseService.queryListTop10ByOrg(orgId, startDate, endDate);
		result.setCode(ResultDto.CODE_SUCCESS);
		result.setMessage("查询成功");
		result.setResult(list);
		return result;
	}
    
	/**
	 * @author fxc
	 * @date   018-03-27 晚上9:00
	 * @date   orgId   
	 * @param  startDate
	 * @param  endDate
	 * @return ResultDto
	 * desc:
	 *     根据机构查询每一类疾病的总数
	*/
	@PostMapping("/queryDiseasesumByOrg")
	public ResultDto queryDiseasesumByOrg(@RequestBody PageMybatis<Map<String, Object>> param) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null);
		result.setResult(physicalDiseaseService.queryDiseasesumByOrg(param));
		System.out.println(result.getResult());
		return result;
	}
	
	/**
	 * @author fxc
	 * @date 2018年3月28日-早上 11:30
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return ResultDto
	 * desc:
	 *     查询男/女患阳性疾病的总数
	 */
	@GetMapping("/queryDiseaseBySexList")
	public ResultDto queryDiseaseBySexList(String orgId, String startDate, String endDate) {
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
		for(int i = 1;i <= 2 ; i++) {
			String col = PhysicalUtils.getSexColumn(String.valueOf(i)) ;
			datas.put(col, physicalDiseaseService.queryDiseaseBySexList(orgId, startDate, endDate, col)) ;
		}
		result.setResult(datas) ;
		return result ;
	}
	
	/**
	 * @author fxc
	 * @date 2018年3月28日-下午16:00:32
	 * @param params
	 * @return 
	 * return List<PhysicalDisease>
	 * desc:
	 *    查询男女患各种疾病的总数
	 */
	
	@PostMapping("/queryDiseaseBySexTables")
	public ResultDto queryDiseaseBySexTables(@RequestBody PageMybatis<Map<String, Object>> param) {
		ResultDto result = new ResultDto(ResultDto.CODE_SUCCESS, "查询成功", null) ;
		result.setResult(physicalDiseaseService.queryDiseaseBySexTables(param)) ;
		return result ;
	}
}
