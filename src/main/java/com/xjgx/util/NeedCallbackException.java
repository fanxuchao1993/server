package com.xjgx.util;

import com.alibaba.fastjson.JSON;

public class NeedCallbackException extends RuntimeException{

	/**
	 *
	 */
	private static final long serialVersionUID = -2756621440425058375L;

	public NeedCallbackException(String message){
		super(message);
	}
	
	public NeedCallbackException(ErrorMessage err){
		super(JSON.toJSONString(err));
	}
	
}
