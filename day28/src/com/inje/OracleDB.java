package com.inje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDB {
	private static Connection conn;
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="scott";
	private static String password="tiger";
	
	private OracleDB() {}

	// ���������� - �̱������� - ���� ��ü �ϳ���
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if(conn==null) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, user, password);
		}
		if(conn.isClosed()) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, user, password);
		}
		return conn;
	}
}










