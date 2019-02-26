/*
 * $Id: codetemplates.xml 2918 2014-01-22 15:29:26Z hs $
 * 版权所有 2016 冠新软件。
 * 保留所有权利。
 */
package com.xjgx.util;

/**
 * @author 侯文利
 * @date 2016年6月27日 下午12:58:56 
 * @Description: 异常错误返回对象
 * 
 */
public class ResultDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 成功返回码 0
	 */
	public static Integer CODE_SUCCESS = 0;
	/**
	 * 失败返回码 1
	 */
	public static Integer CODE_FAIL = -1;
	/**
	 * 系统错误
	 */
	public static Integer CODE_SYSTEM_ERROR = 500;
	/**
	 * 成功或失败代码 成功是0 失败是非0
	 */
	private Integer code;

	/**
	 * 后台需要给前台的信息提示，如失败后，应该设置失败的具体原因
	 */
	private String message;

	/**
	 * 成功后返回的结果
	 */
	private Object result;

	public ResultDto() {
		super();
	}

	/**
	 * 
	 * @param code 成功或失败代码 成功是0 失败是非0
	 * @param message 后台需要给前台的信息提示，如失败后，应该设置失败的具体原因
	 * @param result 成功后返回的结果
	 */
	public ResultDto(Integer code, String message, Object result) {
		super();
		this.code = code;
		this.message = message;
		this.result = result;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public static final ResultDto ResultSuccess(Object result) {
		ResultDto dto = new ResultDto();
		dto.setCode(CODE_SUCCESS);
		dto.setMessage("操作成功");
		dto.setResult(result);
		return dto;
	}
	
	public static final ResultDto ResultFail(String message,Object result) {
		ResultDto dto = new ResultDto();
		dto.setCode(CODE_FAIL);
		dto.setMessage(message);
		dto.setResult(result);
		return dto;
	}
}

