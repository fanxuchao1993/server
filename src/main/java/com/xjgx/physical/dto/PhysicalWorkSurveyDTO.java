package com.xjgx.physical.dto;

public class PhysicalWorkSurveyDTO {
	
	private String orgId ;
	private String districts ;
	private String orgName ;
	/**
	 * desc: 
	 *     0-36个月儿童(应体检人数)
	 */
	private int yjcm ;
	/**
	 * desc: 
	 *     0-36个月儿童(实际体检人数)
	 */
	private int sjcm ;
	/**
	 * desc: 
	 *     3-6岁儿童(应体检人数)
	 */
	private int yjcy ;
	/**
	 * desc: 
	 *     3-6岁儿童(实际体检人数)
	 */
	private int sjcy ; 
	/**
	 * desc: 
	 *     在校学生(应体检人数)
	 */
	private int yjxs ;
	/**
	 * desc: 
	 *     在校学生(实际体检人数)
	 */
	private int sjxs ;
	/**
	 * desc: 
	 *     16-64岁居民(应体检人数)
	 */
	private int yjmjm ;
	/**
	 * desc: 
	 *     16-64岁居民(实际体检人数)
	 */
	private int sjmjm ; 
	/**
	 * desc: 
	 *     65-79居民(应体检人数)
	 */
	private int yjhjm ;
	/**
	 * desc: 
	 *     65-79居民(实际体检人数)
	 */
	private int sjhjm ;
	/**
	 * desc: 
	 *     80岁以上老人(应体检人数)
	 */
	private int yjold ;
	/**
	 * desc: 
	 *     80岁以上老人(实际体检人数)
	 */
	private int sjold ;
	/**
	 * desc: 
	 *     孕产妇(应体检人数)
	 */
	private int yjycf ;
	/**
	 * desc: 
	 *     孕产妇(实际体检人数)
	 */
	private int sjycf ;
	/**
	 * desc: 
	 *     退休职工(应体检人数)
	 */
	private int yjtx ;
	/**
	 * desc: 
	 *     退休职工(实际体检人数)
	 */
	private int sjtx ;
	/**
	 * desc: 
	 *     企业职工(应体检人数)
	 */
	private int yjqy ;
	/**
	 * desc: 
	 *     企业职工(实际体检人数)
	 */
	private int sjqy ;
	
	/**
	 * desc: 
	 *     流动人口(应体检人数)
	 */
	private int yjld ;
	/**
	 * desc: 
	 *     流动人口(实际体检人数)
	 */
	private int sjld ; 
	/**
	 * desc: 
	 *     应体检人数
	 */
	private int yj ;
	/**
	 * desc: 疾病人数
	 *     
	 */
	private int diseasesum ;
	/**
	 * desc: 
	 *     疾病名
	 */
	private String diseasename ;
	/**
	 * desc: 
	 *     阳性人数
	 */
	private int ps ;
	/**
	 * desc: 
	 *     实际体检人数
	 */
	private int sj ; 
	/**
	 * desc: 
	 *     阳性检出率
	 */
	private String popercent ;
	/**
	 * desc: 
	 *     完成率
	 */
	private String percent ;
	
	
	public String getPopercent() {
		return popercent;
	}
	public void setPopercent(String popercent) {
		this.popercent = popercent;
	}
	public int getDiseasesum() {
		return diseasesum;
	}
	public void setDiseasesum(int diseasesum) {
		this.diseasesum = diseasesum;
	}
	
	public String getDiseasename() {
		return diseasename;
	}
	public void setDiseasename(String diseasename) {
		this.diseasename = diseasename;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getYj() {
		return yj;
	}
	public void setYj(int yj) {
		this.yj = yj;
	}
	public int getSj() {
		return sj;
	}
	public void setSj(int sj) {
		this.sj = sj;
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
	public int getYjcm() {
		return yjcm;
	}
	public void setYjcm(int yjcm) {
		this.yjcm = yjcm;
	}
	public int getSjcm() {
		return sjcm;
	}
	public void setSjcm(int sjcm) {
		this.sjcm = sjcm;
	}
	public int getYjcy() {
		return yjcy;
	}
	public void setYjcy(int yjcy) {
		this.yjcy = yjcy;
	}
	public int getSjcy() {
		return sjcy;
	}
	public void setSjcy(int sjcy) {
		this.sjcy = sjcy;
	}
	public int getYjxs() {
		return yjxs;
	}
	public void setYjxs(int yjxs) {
		this.yjxs = yjxs;
	}
	public int getSjxs() {
		return sjxs;
	}
	public void setSjxs(int sjxs) {
		this.sjxs = sjxs;
	}
	public int getYjmjm() {
		return yjmjm;
	}
	public void setYjmjm(int yjmjm) {
		this.yjmjm = yjmjm;
	}
	public int getSjmjm() {
		return sjmjm;
	}
	public void setSjmjm(int sjmjm) {
		this.sjmjm = sjmjm;
	}
	public int getYjhjm() {
		return yjhjm;
	}
	public void setYjhjm(int yjhjm) {
		this.yjhjm = yjhjm;
	}
	public int getSjhjm() {
		return sjhjm;
	}
	public void setSjhjm(int sjhjm) {
		this.sjhjm = sjhjm;
	}
	public int getYjold() {
		return yjold;
	}
	public void setYjold(int yjold) {
		this.yjold = yjold;
	}
	public int getSjold() {
		return sjold;
	}
	public void setSjold(int sjold) {
		this.sjold = sjold;
	}
	public int getYjycf() {
		return yjycf;
	}
	public void setYjycf(int yjycf) {
		this.yjycf = yjycf;
	}
	public int getSjycf() {
		return sjycf;
	}
	public void setSjycf(int sjycf) {
		this.sjycf = sjycf;
	}
	public int getYjtx() {
		return yjtx;
	}
	public void setYjtx(int yjtx) {
		this.yjtx = yjtx;
	}
	public int getSjtx() {
		return sjtx;
	}
	public void setSjtx(int sjtx) {
		this.sjtx = sjtx;
	}
	public int getYjqy() {
		return yjqy;
	}
	public void setYjqy(int yjqy) {
		this.yjqy = yjqy;
	}
	public int getSjqy() {
		return sjqy;
	}
	public void setSjqy(int sjqy) {
		this.sjqy = sjqy;
	}
	public int getYjld() {
		return yjld;
	}
	public void setYjld(int yjld) {
		this.yjld = yjld;
	}
	public int getSjld() {
		return sjld;
	}
	public void setSjld(int sjld) {
		this.sjld = sjld;
	}
	public String getDistricts() {
		return districts;
	}
	public void setDistricts(String districts) {
		this.districts = districts;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	
	
}
