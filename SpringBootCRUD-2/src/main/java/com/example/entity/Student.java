package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	@Column
	private String sname;
	private String semail;
	private long sphone;
	
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getSemail() {
		return semail;
	}
	public long getSphone() {
		return sphone;
	}
	
}
