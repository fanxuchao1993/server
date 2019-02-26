package com.xjgx.physical.dto;

public class AbnormalZbDTO {
	// 排名前十异常指标
	private String itemCode ;
	private String itemName ;
	
	// 男女数量
	private int manNum ;
	private int womanNum ;
	
	// 排名前十检出疾病 
	private String diseaseCode ;
	private String diseaseName ;
	
	// XXX指标各机构检出构成
	// XXX疾病各机构检出构成
	private String orgId ;
	private String orgName ;
	
	private int sum ;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getManNum() {
		return manNum;
	}

	public void setManNum(int manNum) {
		this.manNum = manNum;
	}

	public int getWomanNum() {
		return womanNum;
	}

	public void setWomanNum(int womanNum) {
		this.womanNum = womanNum;
	}
	
}
