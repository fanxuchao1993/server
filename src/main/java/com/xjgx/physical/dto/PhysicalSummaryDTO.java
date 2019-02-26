package com.xjgx.physical.dto;

public class PhysicalSummaryDTO {
	
	private String orgId ;
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
	 *     0-36个月儿童(体检完成率)
	 */
	private String cmp ; 
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
	 *     3-6岁儿童(体检完成率)
	 */
	private String cyp ;
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
	 *     在校学生(体检完成率)
	 */
	private String xsp ;
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
	 *     16-64岁居民(体检完成率)
	 */
	private String mjmp ;
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
	 *     65-79居民(体检完成率)
	 */
	private String hjmp ;
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
	 *     80岁以上老人(体检完成率)
	 */
	private String oldp ;
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
	 *     孕产妇(体检完成率)
	 */
	private String ycfp ;
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
	 *     退休职工(体检完成率)
	 */
	private String txp ;
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
	 *     企业职工(体检完成率)
	 */
	private String qyp ;
	
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
	 *     流动人口(体检完成率)
	 */
	private String ldp ;
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
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
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
	public String getCyp() {
		return cyp;
	}
	public void setCyp(String cyp) {
		this.cyp = cyp;
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
	public String getXsp() {
		return xsp;
	}
	public void setXsp(String xsp) {
		this.xsp = xsp;
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
	public String getMjmp() {
		return mjmp;
	}
	public void setMjmp(String mjmp) {
		this.mjmp = mjmp;
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
	public String getHjmp() {
		return hjmp;
	}
	public void setHjmp(String hjmp) {
		this.hjmp = hjmp;
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
	public String getOldp() {
		return oldp;
	}
	public void setOldp(String oldp) {
		this.oldp = oldp;
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
	public String getYcfp() {
		return ycfp;
	}
	public void setYcfp(String ycfp) {
		this.ycfp = ycfp;
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
	public String getTxp() {
		return txp;
	}
	public void setTxp(String txp) {
		this.txp = txp;
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
	public String getQyp() {
		return qyp;
	}
	public void setQyp(String qyp) {
		this.qyp = qyp;
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
	public String getLdp() {
		return ldp;
	}
	public void setLdp(String ldp) {
		this.ldp = ldp;
	}
	
	
}
