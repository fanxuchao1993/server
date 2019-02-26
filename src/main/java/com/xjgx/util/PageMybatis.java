package com.xjgx.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.hutool.core.util.StrUtil;
/**
 * 
 * @author 孙军
 * @date 2016年7月7日 下午9:28:37 
 * @Description: TODO easyuitable的mybatis分页工具类
 * 
 * @param <T>
 */
public class PageMybatis<T> {
	private int pageNumber;
	private int pageSize;
	private String sortName;
	private String sortOrder;
	private T obj;
	
	private long total;
	private List<T> rows;
	
	@JsonIgnore
	public <E> PageMybatis<E> getData(PageMybatisIns<E, T> my){
		PageMybatis<E> page = new PageMybatis<E>();
		Page<E> p = PageHelper.startPage(pageNumber, pageSize, true);
		my.makeQuery(obj, trans(sortName), sortOrder);
		page.total = p.getTotal();
		page.rows = p.getResult();
		return page;
	}
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public long getTotal() {
		return total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	public static String trans(String str){
		if(StrUtil.isEmpty(str)){
			return null;
		}
        List<Integer> record =new ArrayList<>();
        for(int i=1;i<str.length();i++){//第一个不需加下划线
            char tmp =str.charAt(i);
            if((tmp<='Z')&&(tmp>='A')){
                record.add(i);//记录每个大写字母的位置
            }
        }
         
        str= str.toLowerCase();
        char[] charofstr = str.toCharArray();
        String[] t =new String[record.size()];
        for(int i=0;i<record.size();i++){
            t[i]="_"+charofstr[(int)record.get(i)];//加“_”
        }
        String result ="";
        int flag=0;
        for(int i=0;i<str.length();i++){
            if((flag<record.size())&&(i==(int)record.get(flag))){
                result+=t[flag];
                flag++;
            }
            else
                result+=charofstr[i];
        }
        return result;
    }
	
	public String getSortName() {
		return sortName;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	@Override
	public String toString() {
		return "PageMybatis [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", sortName=" + sortName
				+ ", sortOrder=" + sortOrder + ", obj=" + obj + ", total=" + total + ", rows=" + rows + "]";
	}
	
	
	
}
