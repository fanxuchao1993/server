package com.xjgx.util;

public class ErrorMessage {
	private String message;
	private int type;
	private String code1;
	private String code2;
	private String code3;
	private String code4;
	private String code5;
	private Object object;
	
	public ErrorMessage(String message, int type) {
		super();
		this.message = message;
		this.type = type;
	}
	public ErrorMessage(String message, int type, String code1) {
		super();
		this.message = message;
		this.type = type;
		this.code1 = code1;
	}
	public ErrorMessage(String message, int type, String code1, String code2, String code3, String code4, String code5,
			Object object) {
		super();
		this.message = message;
		this.type = type;
		this.code1 = code1;
		this.code2 = code2;
		this.code3 = code3;
		this.code4 = code4;
		this.code5 = code5;
		this.object = object;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCode1() {
		return code1;
	}
	public void setCode1(String code1) {
		this.code1 = code1;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	public String getCode3() {
		return code3;
	}
	public void setCode3(String code3) {
		this.code3 = code3;
	}
	public String getCode4() {
		return code4;
	}
	public void setCode4(String code4) {
		this.code4 = code4;
	}
	public String getCode5() {
		return code5;
	}
	public void setCode5(String code5) {
		this.code5 = code5;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
	
}
