package com.gimhae.emp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class EmpDaoImpl extends JdbcDaoSupport implements EmpDao{
	RowMapper<EmpVo> rowMapper=new RowMapper<EmpVo>() {

		@Override
		public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return EmpVo.builder()
					.empno(rs.getInt("empno"))
					.ename(rs.getString("ename"))
					.pay(rs.getInt("pay"))
					.hiredate(rs.getDate("hiredate"))
					.build();
		}
	};
	
	@Override
	public List<EmpVo> pullList() {
		String sql="select * from emp38 order by empno";
		return getJdbcTemplate().query(sql, rowMapper);
	}

	@Override
	public EmpVo getList(int pk) {
		return null;
	}

	@Override
	public void addList(String ename, int pay) {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		getJdbcTemplate().update(sql,ename,pay);
	}

	@Override
	public int setList(String ename, int pay, int pk) {
		return 0;
	}

	@Override
	public int rmList(int pk) {
		return 0;
	}


}
