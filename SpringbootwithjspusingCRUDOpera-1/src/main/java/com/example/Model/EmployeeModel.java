package com.example.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeModel {
	@Id
	@Column(name="eid")
	private long eid;
	@Column(name="ename")
	private String ename;
	private long getEid() {
		return eid;
	}
	private void setEid(long eid) {
		this.eid = eid;
	}
	private String getEname() {
		return ename;
	}
	private void setEname(String ename) {
		this.ename = ename;
	}
	
	
	

}

