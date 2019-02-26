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
 * @date 2018年3月20日-下午2:51:29
 * desc 
 *     体检完成情况
 */
@Entity
@Table(name = "PH_PHYSICAL_COMPLETE")
public class PhysicalComplete extends BaseEntity {

	/**
	 * desc: 
	 *     
	 */
	private static final long serialVersionUID = -5774703463240171363L;
	
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
	 *     完成时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape=Shape.STRING, timezone="GMT+8")
	@Temporal(TemporalType.DATE)
	private Date completeDate ;
	
	/**
	 * desc: 
	 *     阳性数
	 */
	private int positiveNums ;

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

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public int getPositiveNums() {
		return positiveNums;
	}

	public void setPositiveNums(int positiveNums) {
		this.positiveNums = positiveNums;
	}
	
}
