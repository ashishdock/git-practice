package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table("student_details")
public class Student {

	@Id
	@Column(name = "s_id")
	private int sid;
	@Column(name = "s_name")
	private String sname;
	@Column(name = "s_city")
	private String scity;

	public Student(int sid, String sname, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
