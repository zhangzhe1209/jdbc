package com.bdqn.dao;

import java.util.List;

import com.bdqn.entity.Student;

/**
 * �ӿڣ�
 * 	public static final �ֶ�
 * 	ֻ���ó��󷽷�
 *  
 *  �淶����׼������
 * 
 * 	JDK �������ݿ���Ҫ�Ľӿ�
 * 	���ݿ�� ʵ���˽ӿ�
 *  �ӿ� -->�����ࣨʵ�ֹ������룩-->Ĭ�ϵ�ͨ��ʵ����
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



