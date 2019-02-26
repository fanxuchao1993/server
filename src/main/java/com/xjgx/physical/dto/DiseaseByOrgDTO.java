package com.xjgx.physical.dto;

import java.util.List;

import com.xjgx.domain.base.BaseEntity;

public class DiseaseByOrgDTO {
	/**
	 * @author fxc
	 * @date   2018-03-39 18:05
	 * desc    查询已经参加体检的每一个机构的前十种疾病 传入参数的dto
	 *     
	 */
	// 传入的机构的集合
	private List<MyEntityDTO> myEntity ;
	//开始日期
	private String startDate ;
	//结束日期
	private String endDate ;
	public List<MyEntityDTO> getMyEntity() {
		return myEntity;
	}
	public void setMyEntity(List<MyEntityDTO> myEntity) {
		this.myEntity = myEntity;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "DiseaseByOrgDTO [myEntity=" + myEntity + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
