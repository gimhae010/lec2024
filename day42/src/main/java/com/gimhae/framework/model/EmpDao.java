package com.gimhae.framework.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EmpDao {
	Logger log=Logger.getLogger(this.getClass());
	DataSource dataSource;
	boolean test;
	
	public EmpDao() {
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		this.dataSource=dataSource;
	}
	public EmpDao(boolean test) {
		this();
		this.test=test;
	}
	
	public List<EmpDto> pullList() throws SQLException{
		String sql="select * from emp38 order by empno";
		List<EmpDto> list=new ArrayList<>();
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
						LocalDate.from(rs.getDate("hiredate").toLocalDate())
						));
		}
		log.debug(list.toString());
		return list;
	}
	
	public EmpDto getList(int pk) throws SQLException {
		String sql="select * from emp38 where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, pk);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				EmpDto bean=new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
						LocalDate.from(rs.getDate("hiredate").toLocalDate())
						);
				log.debug(bean.toString());
				return bean;
			}
		}
		return null;
	}
	
	public int addList(EmpDto bean) throws SQLException {
		String sql="insert into emp38 (ename,hiredate,pay) values (?,now(),?)";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			if(test)conn.setAutoCommit(false);
			pstmt.setString(1, bean.getEname());
			pstmt.setInt(2, bean.getPay());
			int result=pstmt.executeUpdate();
			if(test)conn.rollback();
			if(test)conn.setAutoCommit(true);
			return result;
		}
	}
	
	public int rmList(int pk) throws SQLException {
		String sql="delete from emp38 where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			if(test) conn.setAutoCommit(false);
			pstmt.setInt(1, pk);
			int result=pstmt.executeUpdate();
			if(test) conn.rollback();
			if(test) conn.setAutoCommit(true);
			return result;
		}
	}
	
	public int editList(EmpDto bean) throws SQLException {
		String sql="update emp38 set ename=?,pay=? where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			if(test) conn.setAutoCommit(false);
			pstmt.setString(1, bean.getEname());
			pstmt.setInt(2, bean.getPay());
			pstmt.setInt(3, bean.getEmpno());
			int result=pstmt.executeUpdate();
			if(test) conn.rollback();
			if(test) conn.setAutoCommit(true);
			return result;
		}
	}
}








