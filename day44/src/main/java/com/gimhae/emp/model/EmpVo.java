package com.gimhae.emp.model;

import java.time.LocalDate;

public class EmpVo {
	private int empno, pay;
	private String ename;
	private LocalDate hiredate;
	
	static class Builder{
		int empno, pay;
		String ename;
		LocalDate hiredate;
		
		public Builder empno(int empno) { 
			this.empno=empno;
			return this; 
		}
		public Builder pay(int pay) { 
			this.pay=pay;
			return this; 
		}
		public Builder ename(String ename) { 
			this.ename=ename;
			return this; 
		}
		public Builder hiredate(java.sql.Date hiredate) { 
			this.hiredate=hiredate.toLocalDate();		
			return this; 
		}
		public EmpVo build() {
			return new EmpVo(this);
		}
	}
	
	public EmpVo() {
	}
	public EmpVo(Builder builder) {
		this.empno=builder.empno;
		this.ename=builder.ename;
		this.pay=builder.pay;
		this.hiredate=builder.hiredate;
	}

	public static Builder builder() {
		return new Builder();
	}

	public int getEmpno() {
		return empno;
	}

	public int getPay() {
		return pay;
	}

	public String getEname() {
		return ename;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	@Override
	public String toString() {
		return "EmpVo [empno=" + empno + ", pay=" + pay + ", ename=" + ename + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + pay;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpVo other = (EmpVo) obj;
		if (empno != other.empno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (pay != other.pay)
			return false;
		return true;
	}
}