package com.gimhae.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao() {
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		this.dataSource=dataSource;
	}
	
	public List<EmpDto> pullList() throws SQLException{
		List<EmpDto> list=new ArrayList<>();
		String sql="select * from emp38 order by empno";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())
				list.add(new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
//						LocalDate.parse(rs.getString("hiredate").split(" ")[0])
						LocalDate.from(rs.getTimestamp("hiredate").toLocalDateTime())
						));
		}finally {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
	
	
}
