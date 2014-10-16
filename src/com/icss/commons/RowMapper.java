package com.icss.commons;

//数据装载器

public interface RowMapper<T> {

	T mapRow(java.sql.ResultSet rs, int index) throws Exception;
	//ResultSet是一个关于数据结果集的一个接口,通常用于执行一段查询的SQL语句返回若干条记录
	//ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");
}
