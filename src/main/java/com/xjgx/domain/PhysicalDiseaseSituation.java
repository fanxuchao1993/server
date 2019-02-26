package com.xjgx.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.xjgx.domain.base.BaseEntity;

/**
 * @author xg
 * @date 2018年3月22日-下午3:17:33
 * desc: 
 *     疾病人群分布情况
 */
@Entity
@Table(name = "PH_PHYSICAL_DISEASE_SITUATION")
public class PhysicalDiseaseSituation extends BaseEntity {

	private static final long serialVersionUID = 7082378282801905705L;
	/**
	 * desc: 
	 *     疾病编码
	 */
	private String diseaseCode ;
	
	/**
	 * desc: 
	 *     疾病名称
	 */
	private String diseaseName ;
	
	/**
	 * desc: 
	 *     0-36个月儿童
	 */
	private int childrenMonth ;
	
	/**
	 * desc: 
	 *     3-6岁儿童
	 */
	private int childrenYear ;
	
	/**
	 * desc: 
	 *     在校学生
	 */
	private int student ;
	
	/**
	 * desc: 
	 *     16-64岁居民
	 */
	private int residentMiddle ;
	
	/**
	 * desc: 
	 *     65-79居民
	 */
	private int residentHigh ;
	
	/**
	 * desc: 
	 *     80岁以上老人
	 */
	private int oldMan ;
	
	/**
	 * desc: 
	 *     孕产妇
	 */
	private int Maternal ;
	
	/**
	 * desc: 
	 *     退休职工
	 */
	private int retireWorker ;
	
	/**
	 * desc: 
	 *     企业职工
	 */
	private int enterpriseWorker ;
	
	/**
	 * desc: 
	 *     流动人口
	 */
	private int hobo ;
	/**
	 * desc: 
	 *     检出时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape=Shape.STRING, timezone="GMT+8")
	@Temporal(TemporalType.DATE)
	private Date testDate ;
	/**
	 * 是否重点疾病
	 */
	private int isDisplay ;
	/**
	 * desc: 
	 *     总数
	 */
	@Transient
	private int sum ;
	
	/**
	 * desc: 
	 *     0: 其它
	 *     1: 高血压
	 *     2： 糖尿病
	 *     3： 结核病
	 */
	@Column(columnDefinition="int default 0")
	private int diseaseType ;
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getChildrenMonth() {
		return childrenMonth;
	}
	public void setChildrenMonth(int childrenMonth) {
		this.childrenMonth = childrenMonth;
	}
	public int getChildrenYear() {
		return childrenYear;
	}
	public void setChildrenYear(int childrenYear) {
		this.childrenYear = childrenYear;
	}
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public int getResidentMiddle() {
		return residentMiddle;
	}
	public void setResidentMiddle(int residentMiddle) {
		this.residentMiddle = residentMiddle;
	}
	public int getResidentHigh() {
		return residentHigh;
	}
	public void setResidentHigh(int residentHigh) {
		this.residentHigh = residentHigh;
	}
	public int getOldMan() {
		return oldMan;
	}
	public void setOldMan(int oldMan) {
		this.oldMan = oldMan;
	}
	public int getMaternal() {
		return Maternal;
	}
	public void setMaternal(int maternal) {
		Maternal = maternal;
	}
	public int getRetireWorker() {
		return retireWorker;
	}
	public void setRetireWorker(int retireWorker) {
		this.retireWorker = retireWorker;
	}
	public int getEnterpriseWorker() {
		return enterpriseWorker;
	}
	public void setEnterpriseWorker(int enterpriseWorker) {
		this.enterpriseWorker = enterpriseWorker;
	}
	public int getHobo() {
		return hobo;
	}
	public void setHobo(int hobo) {
		this.hobo = hobo;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public int getDiseaseType() {
		return diseaseType;
	}
	public void setDiseaseType(int diseaseType) {
		this.diseaseType = diseaseType;
	}
	public int getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(int isDisplay) {
		this.isDisplay = isDisplay;
	}
	
}
