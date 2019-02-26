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
 * @date 2018年3月20日-下午2:50:58
 * desc 
 *     机构体检进度
 */
@Entity
@Table(name = "PH_PHYSICAL_PROGRESS")
public class PhysicalProgress extends BaseEntity {

	/**
	 * desc: 
	 *     
	 */
	private static final long serialVersionUID = -7139945789907897296L;
	
	/**
	 * desc: 
	 *     登记人数
	 */
	private int regNums ;
	
	/**
	 * desc: 
	 *     签到人数
	 */
	private int signNums ;
	
	
	
	/**
	 * desc: 
	 *     分检中人数
	 */
	private int sortNums ;
	
	/**
	 * desc: 
	 *     待总检人数
	 */
	private int waitNums ;
	
	/**
	 * desc: 
	 *     已总检人数
	 */
	private int finishNums ;
	
	/**
	 * desc: 
	 *     已打印人数
	 */
	private int printNums ;
	
	/**
	 * desc: 
	 *     领取人数
	 */
	private int receiveNums ;
	
	/**
	 * desc: 
	 *     体检总数
	 *//*
	private int physicalNums ;*/
	
	/**
	 * desc: 
	 *     体检日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape=Shape.STRING, timezone="GMT+8")
	@Temporal(TemporalType.DATE)
	private Date physicalDate ;
	
	@Transient
	private int sum ;
	
	@Transient
	private String percent ;
	
	/**
	 * desc: 
	 *		1月 -12月    
	 */
	@Transient
	private int m1 ;
	@Transient
	private int m2 ;
	@Transient
	private int m3 ;
	@Transient
	private int m4 ;
	@Transient
	private int m5 ;
	@Transient
	private int m6 ;
	@Transient
	private int m7 ;
	@Transient
	private int m8 ;
	@Transient
	private int m9 ;
	@Transient
	private int m10 ;
	@Transient
	private int m11 ;
	@Transient
	private int m12 ;

	public int getRegNums() {
		return regNums;
	}

	public void setRegNums(int regNums) {
		this.regNums = regNums;
	}

	public int getSortNums() {
		return sortNums;
	}

	public void setSortNums(int sortNums) {
		this.sortNums = sortNums;
	}

	public int getWaitNums() {
		return waitNums;
	}

	public void setWaitNums(int waitNums) {
		this.waitNums = waitNums;
	}

	public int getFinishNums() {
		return finishNums;
	}

	public void setFinishNums(int finishNums) {
		this.finishNums = finishNums;
	}

	public int getPrintNums() {
		return printNums;
	}

	public void setPrintNums(int printNums) {
		this.printNums = printNums;
	}

	/*public int getPhysicalNums() {
		return physicalNums;
	}

	public void setPhysicalNums(int physicalNums) {
		this.physicalNums = physicalNums;
	}*/

	public Date getPhysicalDate() {
		return physicalDate;
	}

	public void setPhysicalDate(Date physicalDate) {
		this.physicalDate = physicalDate;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public int getSignNums() {
		return signNums;
	}

	public void setSignNums(int signNums) {
		this.signNums = signNums;
	}

	public int getReceiveNums() {
		return receiveNums;
	}

	public void setReceiveNums(int receiveNums) {
		this.receiveNums = receiveNums;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public int getM4() {
		return m4;
	}

	public void setM4(int m4) {
		this.m4 = m4;
	}

	public int getM5() {
		return m5;
	}

	public void setM5(int m5) {
		this.m5 = m5;
	}

	public int getM6() {
		return m6;
	}

	public void setM6(int m6) {
		this.m6 = m6;
	}

	public int getM7() {
		return m7;
	}

	public void setM7(int m7) {
		this.m7 = m7;
	}

	public int getM8() {
		return m8;
	}

	public void setM8(int m8) {
		this.m8 = m8;
	}

	public int getM9() {
		return m9;
	}

	public void setM9(int m9) {
		this.m9 = m9;
	}

	public int getM10() {
		return m10;
	}

	public void setM10(int m10) {
		this.m10 = m10;
	}

	public int getM11() {
		return m11;
	}

	public void setM11(int m11) {
		this.m11 = m11;
	}

	public int getM12() {
		return m12;
	}

	public void setM12(int m12) {
		this.m12 = m12;
	}
}

