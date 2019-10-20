package com.heraizen.cj.coll;

public class Employee {
	int empno;
	String empname;
	String empjob;
	public Employee showInfo(int empno)
	{
		return null;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empjob=" + empjob + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpjob() {
		return empjob;
	}
	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}
}
