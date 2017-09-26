package com.bdqn.entity;

import java.io.Serializable;

/**
 * JavaBean
 * 	����public
 * 	�ù������޲ι���
 * 	˽������
 * 	���е�getter setter����
 * 
 * Serializable ���л�ʹ��
 * 	��һ������ д�� �ı���
 * 	
 * @author Zeus
 *
 */
public class Student implements Serializable {
	
	/**
	 * int 		ֵ���ͣ�null
	 * Integer	�������͡����Ը�ֵΪnull��int����
	 */
	private Integer id;
	private String loginName;
	private String password;
	private String stuName;
	private Integer age;
	
	//short ������     long ������
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
