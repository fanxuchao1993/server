package com.xjgx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.xjgx.domain.base.BaseEntity;

/**
 * @author xg
 * @date 2018年3月20日-下午1:01:05
 * desc 
 *     体检人数表
 */
@Entity
@Table(name = "PH_PHYSICAL_NUMS")
public class PhysicalNums extends BaseEntity{

	/**
	 * desc: 
	 *     
	 */
	private static final long serialVersionUID = 7802734309272249709L;

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
	 *     年份
	 */
	private int cyear = 1970;

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

	public int getCyear() {
		return cyear;
	}

	public void setCyear(int cyear) {
		this.cyear = cyear;
	}
	
}
