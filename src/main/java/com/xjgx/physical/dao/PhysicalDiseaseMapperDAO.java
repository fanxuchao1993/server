package com.xjgx.physical.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xjgx.domain.PhysicalAbnormalAge;
import com.xjgx.domain.PhysicalDisease;
import com.xjgx.domain.PhysicalDiseaseSituation;
import com.xjgx.physical.dto.AbnormalZbDTO;

@Mapper
public interface PhysicalDiseaseMapperDAO {
	
	/**
	 * @author xg
	 * @date 2018年3月23日-上午11:21:08
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return List<AbnormalZbDTO>
	 * desc:
	 *     排名前十检出疾病 
	 */
	List<AbnormalZbDTO> queryListTop10(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate) ;
	
	/**
	 * @author xg
	 * @date 2018年3月23日-上午11:22:21
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @param itemCode
	 * @return 
	 * return List<AbnormalZbDTO>
	 * desc:
	 *     根据疾病查询各机构检出构成
	 */
	List<AbnormalZbDTO> queryDiseaseList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate, 
			@Param("diseaseCode") String diseaseCode) ;
	
	/**
	 * @author fxc
	 * @date   pOrgId   
	 * @param  orgName
	 * @return List<PhysicalDisease>
	 * desc:
	 *     查询排名前十个的疾病总数。
    */
	List<PhysicalDisease> queryDiseaseListFan(@Param("pOrgId") String pOrgId,@Param("orgName") String orgName) ;
	
	/**
	 * @author fxc
	 * @date   orgId   
	 * @param  startDate
	 * @param  endDate
	 * @return List<PhysicalDisease>
	 * desc:
	 *     查询患病的人所属的下级机构(下拉显示)。
    */
	List<PhysicalDisease> queryOrgByDiseaseList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate) ;
	
	/**
	 * @author fxc
	 * @date   2018-03-27 早上9:00
	 * @param  orgId   
	 * @param  startDate
	 * @param  endDate
	 * @return List<PhysicalDisease>
	 * desc:
	 *     查询每一个机构排名前十的10种疾病，并且查出每一种疾病的总数。这个org_id指的是表中的org_id
	*/
	List<PhysicalDisease> queryListTop10ByOrg(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate);
	
	/**
	 * @author fxc
	 * @date   018-03-27 晚上9:00
	 * @date   orgId   
	 * @param  startDate
	 * @param  endDate
	 * @return List<PhysicalDisease>
	 * desc:
	 *     根据机构查询每一类疾病的总数
	*/
	public List<PhysicalDisease> queryDiseasesumByOrg(Map<String, Object> params) ;

	/**
	 * @author fxc
	 * @date 2018年3月28日-早上 11:30
	 * @param orgId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * return List<PhysicalDisease>
	 * desc:
	 *     查询男/女患阳性疾病的总数
	 */
	List<PhysicalDisease> queryDiseaseBySexList(@Param("orgId") String orgId, 
			@Param("startDate") String startDate, @Param("endDate") String endDate,@Param("column") String column);
	
	/**
	 * @author fxc
	 * @date 2018年3月28日-下午16:00:32
	 * @param params
	 * @return 
	 * return List<PhysicalDisease>
	 * desc:
	 *    查询男女患各种疾病的总数
	 */
	public List<PhysicalDisease> queryDiseaseBySexTables(Map<String, Object> params) ;
	
}
