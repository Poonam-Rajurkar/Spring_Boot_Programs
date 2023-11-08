package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int id;
	@Column //(name="TeacherName")
	private String tname;
	@Column //(name="TeacherSurname")
	private String tsurname;
	private String temail;
	private long tphone;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsurname() {
		return tsurname;
	}
	public void setTsurname(String tsurname) {
		this.tsurname = tsurname;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public long getTphone() {
		return tphone;
	}
	public void setTphone(long tphone) {
		this.tphone = tphone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
