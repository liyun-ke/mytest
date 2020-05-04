package com.test;

public class Employee {
	private int empno; // 员工编号
	private String ename;// 员工姓名
	private Integer salary; // 薪水
	private Integer deptno; // 所属部门号

	public Employee() {

	}

	public Employee(int empno, String ename, int salary, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", deptno=" + deptno + "]";
	}
	
	
}
