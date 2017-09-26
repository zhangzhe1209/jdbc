package com.bdqn.dao;

import java.util.List;

import com.bdqn.entity.Student;

/**
 * 接口：
 * 	public static final 字段
 * 	只能用抽象方法
 *  
 *  规范、标准、能力
 * 
 * 	JDK 连接数据库需要的接口
 * 	数据库放 实现了接口
 *  接口 -->抽象类（实现公共代码）-->默认的通用实现类
 * @author Zeus
 *
 */
public interface StudentDao {
	public Student findById(Integer id);
	public List<Student> findAll();
	public int insert(Student stu);
	public int delete(Integer id);
	public int update(Student stu);
}



