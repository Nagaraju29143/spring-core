package spring.dao;

import java.util.Date;

public class EmployeeDto {
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private double sal;
	private double comm;
	private int deptno;
	
	public EmployeeDto() {
		
	}
	
	public EmployeeDto(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm,int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public int getMgr() {
		return mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public double getSal() {
		return sal;
	}

	public double getComm() {
		return comm;
	}

	public int getDeptno() {
		return deptno;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	

}
