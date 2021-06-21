package com.nile.hellorest.controller;

public class EmployeeResponse{
	private int id;
	private String fname;
	private String sname;

	public EmployeeResponse( int id ,String fname, String sname) {
		this.fname = fname;
		this.sname = sname;
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

	public void setSname(String sname){
		this.sname = sname;
	}

	public String getSname(){
		return sname;
	}


	@Override
 	public String toString(){
		return 
			"EmployeeResponse{" + 
			"fname = '" + fname + '\'' + 
			",sname = '" + sname + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
