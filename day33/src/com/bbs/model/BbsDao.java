package com.bbs.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Mysql;

public class BbsDao {

	public List<BbsDto> getList() throws SQLException {
		List<BbsDto> list=new ArrayList<>();
		String sql="select * from bbs01 order by num desc";
		try(
				Connection conn=Mysql.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			while(rs.next()) {
				BbsDto bean=new BbsDto();
				bean.setNum(rs.getInt("num"));
				bean.setSub(rs.getString("sub"));
				bean.setId(rs.getString("id"));
				bean.setCnt(rs.getInt("cnt"));
				list.add(bean);
			}
		}
		return list;
	}
}





