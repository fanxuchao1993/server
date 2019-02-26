/*
 * $Id: codetemplates.xml 2918 2014-01-22 15:29:26Z hs $
 * 版权所有 2016 冠新软件。
 * 保留所有权利。
 */
package com.xjgx.util;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hutool.core.exceptions.ExceptionUtil;


/**
 * @author hwl
 * @date 2016年6月27日 下午12:55:30 
 * @Description: 公共异常处理方法
 * 
 * 
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultDto jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		logger.error("GlobalExceptionHandler", e);
		String exceptionStr = ExceptionUtil.stacktraceToString(e) ;
		logger.error("GlobalExceptionHandler=ExceptionUtils.getFullStackTrace(e)", exceptionStr);
		String fullMsg = ExceptionUtil.getMessage(e) + "\n" + exceptionStr;
		// 校验通用型错误
		ResultDto result = null ;
		if (e instanceof NeedCallbackException) {
			result = new ResultDto(ResultDto.CODE_FAIL,e.getMessage(), null);
		} else {
			result = new ResultDto(ResultDto.CODE_SYSTEM_ERROR,
					"<title>系统错误</title>请点击【详细信息】截图，或者点击【复制信息】整理到记事本中发送给冠新公司客服人员&&" + fullMsg, null);
		}
		return result;
	}
}

