package com.xjgx.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.xjgx.domain.base.BaseEntity;

/**
 * @author xg
 * @date 2018年3月22日-下午3:10:03
 * desc: 
 *     体检异常指标
 */
@Entity
@Table(name = "PH_PHYSICAL_ABNORMAL")
public class PhysicalAbnormal extends BaseEntity{
	
	private static final long serialVersionUID = -7244465898100006891L;
	/**
	 * desc: 
	 *     指标编码
	 */
	private String itemCode ;
	/**
	 * desc: 
	 *     指标名称
	 */
	private String itemName ;
	/**
	 * desc: 
	 *     异常人数
	 */
	private int	ditemNum ;
	/**
	 * desc: 
	 *     检出时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape=Shape.STRING, timezone="GMT+8")
	@Temporal(TemporalType.DATE)
	private Date testDate ;
	/**
	 * desc: 
	 *     男性人数
	 */
	private int manNum ;
	/**
	 * desc: 
	 *     女性人数
	 */
	private int womanNum ;
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
	public int getDitemNum() {
		return ditemNum;
	}
	public void setDitemNum(int ditemNum) {
		this.ditemNum = ditemNum;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
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
