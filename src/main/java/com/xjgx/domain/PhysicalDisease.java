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
 * @date 2018年3月20日-下午2:51:12
 * desc 
 *     体检疾病情况
 */
@Entity
@Table(name = "PH_PHYSICAL_DISEASE")
public class PhysicalDisease extends BaseEntity {
	
	/**
	 * desc: 
	 *     
	 */
	private static final long serialVersionUID = -1935089379782155861L;

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
	 *     疾病人数
	 */
	private int diseaseNums ;
	
	/**
	 * desc: 
	 *     男性人数
	 */
	private int maleNums ;
	
	/**
	 * desc: 
	 *     女性人数
	 */
	private int femaleNums ;
	
	/**
	 * desc: 
	 *     检出时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape=Shape.STRING, timezone="GMT+8")
	@Temporal(TemporalType.DATE)
	private Date detectionDate ;
	
	/**
	 * sum: 总人数
	 *     
	 */
	@Transient
	private String sum ;
	
	/**
	 * desc: 
	 *     0: 其它
	 *     1: 高血压
	 *     2： 糖尿病
	 *     3： 结核病
	 */
	@Column(columnDefinition="int default 0")
	private int diseaseType ;
	
	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
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

	public int getDiseaseNums() {
		return diseaseNums;
	}

	public void setDiseaseNums(int diseaseNums) {
		this.diseaseNums = diseaseNums;
	}

	public Date getDetectionDate() {
		return detectionDate;
	}

	public void setDetectionDate(Date detectionDate) {
		this.detectionDate = detectionDate;
	}

	public int getMaleNums() {
		return maleNums;
	}

	public void setMaleNums(int maleNums) {
		this.maleNums = maleNums;
	}

	public int getFemaleNums() {
		return femaleNums;
	}

	public void setFemaleNums(int femaleNums) {
		this.femaleNums = femaleNums;
	}

	public int getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(int diseaseType) {
		this.diseaseType = diseaseType;
	}

	@Override
	public String toString() {
		return "PhysicalDisease [diseaseCode=" + diseaseCode + "]";
	}
	
}
