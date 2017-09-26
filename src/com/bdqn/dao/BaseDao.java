package com.bdqn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class BaseDao {
	/**
	 * ���Connection
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			//����
			Class.forName("com.mysql.jdbc.Driver");
			//���ݲ�ͬ�����ݿ⣬������Ӧ��Connection����
			conn = DriverManager
					.getConnection
					("jdbc:mysql://127.0.0.1:3306/school",
							"root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ر����ݿ�������Դ
	 * @param conn
	 * @param stmt
	 * @param rs
	 */
	public static void closeAll(
			Connection conn,
			Statement stmt,
			ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
