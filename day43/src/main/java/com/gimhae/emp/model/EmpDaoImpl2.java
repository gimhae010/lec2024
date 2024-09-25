package com.gimhae.emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EmpDaoImpl2 implements EmpDao {
	DataSource dataSource;
	public EmpDaoImpl2() {
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		this.dataSource=dataSource;
	}
	public List<EmpDto> pullList(){
		String sql="select empno,pay,ename,hiredate from emp38 order by empno";
		List<EmpDto> list=new ArrayList<>();
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new EmpDto(
						rs.getInt(1),rs.getInt(2),rs.getString(3)
						, LocalDate.from(rs.getDate(4).toLocalDate())
						));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public void addList(String ename, int pay){
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, ename);
			pstmt.setInt(2, pay);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public EmpDto getList(int empno){
		String sql="select empno,pay,ename,hiredate from emp38 where empno=?";
		EmpDto bean=null;
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, empno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				bean=new EmpDto(
						rs.getInt(1),rs.getInt(2),rs.getString(3),
						LocalDate.from(rs.getDate(4).toLocalDate())
						);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bean;
	}
	public int editList(String ename, int pay, int empno){
		String sql="update emp38 set ename=?,pay=? where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, ename);
			pstmt.setInt(2, pay);
			pstmt.setInt(3, empno);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int rmList(int empno){
		String sql="delete from emp38 where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, empno);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}




















