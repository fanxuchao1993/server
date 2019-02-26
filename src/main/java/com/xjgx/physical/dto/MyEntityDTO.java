package com.xjgx.physical.dto;

import java.util.List;

import com.xjgx.domain.PhysicalDisease;

public class MyEntityDTO {

	/**
	 * @author fxc
	 * @date   2018-03-29 7:00
	 * desc    传入参数和返回数据的实体
	 *     
	 */
	//传入的机构id
	private String pOrgId ;
	//返回的机构名称
	private String orgName ;
	//返回的疾病名称
    private String diseaseName;
    //返回的疾病总数
    private String diseaseNums;
    //传入的前十疾病
	private List<PhysicalDisease>  diseaseCodes ;
    //传入的其实日期
	private String startDate ;
	//传入的终止日期
    private String endDate;
    /** 排名前十的疾病编码*/
    private String M0;
    private String M1;
    private String M2;
    private String M3;
    private String M4;
    private String M5;
    private String M6;
    private String M7;
    private String M8;
    private String M9;
	public String getpOrgId() {
		return pOrgId;
	}
	public void setpOrgId(String pOrgId) {
		this.pOrgId = pOrgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getDiseaseNums() {
		return diseaseNums;
	}
	public void setDiseaseNums(String diseaseNums) {
		this.diseaseNums = diseaseNums;
	}
	public List<PhysicalDisease> getDiseaseCodes() {
		return diseaseCodes;
	}
	public void setDiseaseNames(List<PhysicalDisease> diseaseCodes) {
		this.diseaseCodes = diseaseCodes;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getM0() {
		return M0;
	}
	public void setM0(String m0) {
		M0 = m0;
	}
	public String getM1() {
		return M1;
	}
	public void setM1(String m1) {
		M1 = m1;
	}
	public String getM2() {
		return M2;
	}
	public void setM2(String m2) {
		M2 = m2;
	}
	public String getM3() {
		return M3;
	}
	public void setM3(String m3) {
		M3 = m3;
	}
	public String getM4() {
		return M4;
	}
	public void setM4(String m4) {
		M4 = m4;
	}
	public String getM5() {
		return M5;
	}
	public void setM5(String m5) {
		M5 = m5;
	}
	public String getM6() {
		return M6;
	}
	public void setM6(String m6) {
		M6 = m6;
	}
	public String getM7() {
		return M7;
	}
	public void setM7(String m7) {
		M7 = m7;
	}
	public String getM8() {
		return M8;
	}
	public void setM8(String m8) {
		M8 = m8;
	}
	public String getM9() {
		return M9;
	}
	public void setM9(String m9) {
		M9 = m9;
	}
	@Override
	public String toString() {
		return "MyEntityDTO [pOrgId=" + pOrgId + ", orgName=" + orgName + ", diseaseName=" + diseaseName
				+ ", diseaseNums=" + diseaseNums + ", diseaseCodes=" + diseaseCodes + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", M0=" + M0 + ", M1=" + M1 + ", M2=" + M2 + ", M3=" + M3 + ", M4=" + M4
				+ ", M5=" + M5 + ", M6=" + M6 + ", M7=" + M7 + ", M8=" + M8 + ", M9=" + M9 + "]";
	}
	
	
	
}
