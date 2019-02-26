package com.xjgx.physical.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class PhysicalCountDTO {

	/**
	 * @author fxc
	 * @date 
	 * desc 
	 *     
	 */
	
	private static final long serialVersionUID = -5774703463240171363L;
	// 参与体检机构
	private int physicalCompanyNumber;
	//应体检人数
	private int checkNumber;
	//已体检人数
	private int realCheckNumber;
	//疑似阳性疾病人数
	private int positiveNumber;
	//阳性率
	private String positiveRate;
	//体检完成率
	private String realCheckRate;
	//体检完成日期
	private String completeDate ;
	//上级机构
	private String pOrgId;
	//机构名称
	private String orgName;
    //年
	private String year;
	//月
	private String month;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getCompleteDate() {
		return completeDate;
	}
	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}
	public String getpOrgId() {
		return pOrgId;
	}
	public void setpOrgId(String pOrgId) {
		this.pOrgId = pOrgId;
	}
	public int getPhysicalCompanyNumber() {
		return physicalCompanyNumber;
	}
	public void setPhysicalCompanyNumber(int physicalCompanyNumber) {
		this.physicalCompanyNumber = physicalCompanyNumber;
	}
	public int getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}
	public int getRealCheckNumber() {
		return realCheckNumber;
	}
	public void setRealCheckNumber(int realCheckNumber) {
		this.realCheckNumber = realCheckNumber;
	}
	public int getPositiveNumber() {
		return positiveNumber;
	}
	public void setPositiveNumber(int positiveNumber) {
		this.positiveNumber = positiveNumber;
	}
	public String getPositiveRate() {
		return positiveRate;
	}
	public void setPositiveRate(String positiveRate) {
		this.positiveRate = positiveRate;
	}
	public String getRealCheckRate() {
		return realCheckRate;
	}
	public void setRealCheckRate(String realCheckRate) {
		this.realCheckRate = realCheckRate;
	}
	
}
