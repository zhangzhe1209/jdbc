package com.bdqn.entity;

import java.io.Serializable;

/**
 * JavaBean
 * 	类是public
 * 	用公共的无参构造
 * 	私有属性
 * 	公有的getter setter方法
 * 
 * Serializable 序列化使用
 * 	把一个对象 写到 文本中
 * 	
 * @author Zeus
 *
 */
public class Student implements Serializable {
	
	/**
	 * int 		值类型，null
	 * Integer	引用类型。可以赋值为null的int类型
	 */
	private Integer id;
	private String loginName;
	private String password;
	private String stuName;
	private Integer age;
	
	//short 短整型     long 长整型
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

	
	
}
