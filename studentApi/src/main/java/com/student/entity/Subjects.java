package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subjects {
	@Id
	@GeneratedValue
	private String subName;
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSemister() {
		return Semister;
	}
	public void setSemister(String semister) {
		Semister = semister;
	}
	private String subCode;
	private String Semister;

}
