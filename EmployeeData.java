package com.encappro;

public class EmployeeData {
	
	private int empId;
	private String empName;
	private long empMob;
	private float sal;
	
	
	private Address add;
	
	
	
	
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpMob() {
		return empMob;
	}
	public void setEmpMob(long empMob) {
		this.empMob = empMob;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		
		if(sal>0)
		{
			this.sal = sal;
		}else
		{
			this.sal=0;
		}
		
		
	}
	
	
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	


}
