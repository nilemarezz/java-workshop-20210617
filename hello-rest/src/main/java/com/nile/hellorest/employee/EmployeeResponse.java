package com.nile.hellorest.employee;

import java.util.Objects;

public class EmployeeResponse{
	private int id;
	private String fname;
	private String lname;

	public EmployeeResponse() {
	}

	public EmployeeResponse(int id , String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFname(String fname){
		this.fname = fname;
	}

	public String getFname(){
		return fname;
	}

	public void setLname(String lname){
		this.lname = lname;
	}

	public String getLname(){
		return lname;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EmployeeResponse employee = (EmployeeResponse) o;
		return id == employee.id &&
				Objects.equals(fname, employee.fname)
				&& Objects.equals(lname, employee.lname);
	}

	@Override
	public String toString() {
		return "EmployeeResponse{" +
				"id=" + id +
				", fname='" + fname + '\'' +
				", lname='" + lname + '\'' +
				'}';
	}
}
