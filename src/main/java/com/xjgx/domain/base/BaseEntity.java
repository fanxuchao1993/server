package com.xjgx.domain.base;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	protected String id ;
	
	/**
	 * desc: 
	 *     机构ID
	 */
	protected String orgId ;
	
	/**
	 * desc: 
	 *     上级机构ID
	 */
	protected String pOrgId ;
	
	/**
	 * desc: 
	 *     机构名称
	 */
	protected String orgName ;
	
	/**
	 * desc: 
	 *     所属区划
	 */
	protected String districts ;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getpOrgId() {
		return pOrgId;
	}

	public void setpOrgId(String pOrgId) {
		this.pOrgId = pOrgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDistricts() {
		return districts;
	}

	public void setDistricts(String districts) {
		this.districts = districts;
	}
	
}
