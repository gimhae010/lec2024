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
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public EmpDao() {
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		this.dataSource=dataSource;
	}
	
	public void close() throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
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
			close();
		}
		return list;
	}

	public EmpDto getList(int empno) throws SQLException {
		String sql="select * from emp38 where empno=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs=pstmt.executeQuery();
			if(rs.next())
				return new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
						LocalDate.from(rs.getDate("hiredate").toLocalDate())
						);
		}finally {
			close();
		}
		return null;
	}

	public void addList(String ename, int pay) throws SQLException {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setInt(2, pay);
			pstmt.executeUpdate();
		}finally {
			close();
		}
	}
	
	public int rmList(int pk) throws SQLException {
		String sql="delete from emp38 where empno=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, pk);
			return pstmt.executeUpdate();
		}finally {
			close();
		}
	}
	
	public int editList(EmpDto bean) throws SQLException {
		String sql="update emp38 set ename=?,pay=? where empno=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getEname());
			pstmt.setInt(2, bean.getPay());
			pstmt.setInt(3, bean.getEmpno());
			return pstmt.executeUpdate();
		}finally {
			close();
		}
	}
	
}
















