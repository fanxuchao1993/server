package com.xjgx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.util.StringUtils;

public class PhysicalUtils {

	public static boolean isValidDate(String str) {
		boolean convertSuccess = true;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			format.setLenient(false);
			format.parse(str);
		} catch (ParseException e) {
			convertSuccess = false;
		}
		return convertSuccess;
	}
	
	public static String getColumn(String column) {
		if (StringUtils.isEmpty(column)) {
			return "" ;
		}
		switch(column) {
			case "1":
				return "MATERNAL" ;
			case "2":
				return "CHILDREN_MONTH" ;
			case "3":
				return "CHILDREN_YEAR" ;
			case "4":
				return "ENTERPRISE_WORKER" ;
			case "5":
				return "HOBO" ;
			case "6":
				return "OLD_MAN" ;
			case "7":
				return "RESIDENT_HIGH" ;
			case "8":
				return "RESIDENT_MIDDLE" ;
			case "9":
				return "RETIRE_WORKER" ;
			case "10":
				return "STUDENT" ;
		}
		return "" ;
	}
	
	public static String getAgeColumn(String column) {
		if (StringUtils.isEmpty(column)) {
			return "" ;
		}
		switch(column) {
			case "1":
				return "AGED1" ;
			case "2":
				return "AGED2" ;
			case "3":
				return "CHILDREN1" ;
			case "4":
				return "CHILDREN2" ;
			case "5":
				return "YOUTH1" ;
			case "6":
				return "YOUTH2" ;
			case "7":
				return "YOUTH3" ;
			case "8":
				return "YOUTH4" ;
		}
		return "" ;
	}
	
	public static String getSexColumn(String column) {
		if (StringUtils.isEmpty(column)) {
			return "" ;
		}
		switch(column) {
			case "1":
				return "MALE_NUMS" ;
			case "2":
				return "FEMALE_NUMS" ;
		}
		return "" ;
	}

}
