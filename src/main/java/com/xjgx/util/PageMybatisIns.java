package com.xjgx.util;
/**
 * 
 * @author 孙军
 * @date 2016年7月7日 下午9:29:12 
 * @Description: TODO easyuitable的分页工具接口，目的是让开发人员专注于查询的编写而无需关系分页参数
 * 
 * @param <E>
 * @param <T>
 */
public interface PageMybatisIns<E,T> {
	public void makeQuery(T obj,String sortName,String sortOrder);
}
