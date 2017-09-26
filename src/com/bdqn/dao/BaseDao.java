package com.bdqn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class BaseDao {
	/**
	 * 获得Connection
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			//反射
			Class.forName("com.mysql.jdbc.Driver");
			//根据不同的数据库，生成相应的Connection对象。
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
	 * 关闭数据库连接资源
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
