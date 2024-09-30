package com.gimhae.emp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmpDaoImpl extends JdbcDaoSupport implements EmpDao {
	RowMapper<EmpVo> rowMapper=new RowMapper<EmpVo>() {
		
		@Override
		public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new EmpVo(
					rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
					LocalDate.from(rs.getDate("hiredate").toLocalDate())
					);
		}
	};

	public List<EmpVo> pullList(){
		String sql="select * from emp38 order by empno";
		return getJdbcTemplate().query(sql, rowMapper);
	}
}
