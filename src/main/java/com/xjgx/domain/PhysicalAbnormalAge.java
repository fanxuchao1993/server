package com.xjgx.domain;

import java.util.Date;

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
 * @date 2018年3月22日-下午3:20:31
 * desc: 
 *     
 */
/**
 * @author xg
 * @date 2018年3月22日-下午3:26:32
 * desc: 
 *     
 */
@Entity
@Table(name = "PH_PHYSICAL_ABNORMAL_AGE")
public class PhysicalAbnormalAge extends BaseEntity {

	private static final long serialVersionUID = 274620796474453458L;
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
	 *     0-6岁
	 */
	private int children1 ;
	/**
	 * desc: 
	 *     7-15岁
	 */
	private int children2 ;
	/**
	 * desc: 
	 *     15-35岁
	 */
	private int youth1 ;
	/**
	 * desc: 
	 *     35-45岁
	 */
	private int youth2 ;
	/**
	 * desc: 
	 *     45-55岁
	 */
	private int youth3 ;
	/**
	 * desc: 
	 *     55-65岁
	 */
	private int youth4 ;
	/**
	 * desc: 
	 *     65-79岁
	 */
	private int aged1 ;
	/**
	 * desc: 
	 *     80岁以上
	 */
	private int aged2 ;
	
	/**
	 * desc: 
	 *     检出时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape=Shape.STRING, timezone="GMT+8")
	@Temporal(TemporalType.DATE)
	private Date testDate ;
	
	@Transient
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

	public int getChildren1() {
		return children1;
	}

	public void setChildren1(int children1) {
		this.children1 = children1;
	}

	public int getChildren2() {
		return children2;
	}

	public void setChildren2(int children2) {
		this.children2 = children2;
	}

	public int getYouth1() {
		return youth1;
	}

	public void setYouth1(int youth1) {
		this.youth1 = youth1;
	}

	public int getYouth2() {
		return youth2;
	}

	public void setYouth2(int youth2) {
		this.youth2 = youth2;
	}

	public int getYouth3() {
		return youth3;
	}

	public void setYouth3(int youth3) {
		this.youth3 = youth3;
	}

	public int getYouth4() {
		return youth4;
	}

	public void setYouth4(int youth4) {
		this.youth4 = youth4;
	}

	public int getAged1() {
		return aged1;
	}

	public void setAged1(int aged1) {
		this.aged1 = aged1;
	}

	public int getAged2() {
		return aged2;
	}

	public void setAged2(int aged2) {
		this.aged2 = aged2;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
