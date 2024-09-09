package com.home.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.home.util.Mysql;

public class EmpDao {

	public List<EmpDto> getList(){
		List<EmpDto> list=new ArrayList<>();
		String sql="SELECT a.sabun, a.ename as en, a.pay,b.dname FROM emp a "
						+"left outer JOIN dept b ON a.deptno=b.deptno order by sabun desc";
		try(
				Connection conn=Mysql.getConection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			while(rs.next()) {
				EmpDto bean=new EmpDto();
				bean.setEmpno(rs.getInt("a.sabun"));
				bean.setEname(rs.getString("en"));
				bean.setPay(rs.getInt("a.pay"));
				bean.setDname(rs.getString("b.dname"));
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void addList(String ename,int pay) {
		String sql="insert into emp (ename,pay) values ('"+ename+"',"+pay+")";
		try(
				Connection conn=Mysql.getConection();
				Statement stmt=conn.createStatement();
				){
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public EmpDto getOne(int sabun) {
		EmpDto bean=new EmpDto();
		String sql="select sabun,ename,mgr,pay,(select dname from dept where deptno="
				+"(select deptno from emp where sabun="+sabun+")) name from emp where sabun="+sabun;
		try(
				Connection conn=Mysql.getConection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			if(rs.next()) {
				bean.setEmpno(rs.getInt("sabun"));
				bean.setEname(rs.getString("ename"));
				bean.setMgr(rs.getInt("mgr"));
				bean.setPay(rs.getInt("pay"));
				bean.setDname(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bean;
	}
	
}














