package com.eSchool.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {


	private int studenID;
	private String studentName;
	private Parent parent;
	private String AADHAR;
	private Branch branch;
	private String gender;
	private String dob;
	private String joiningDate;
	
	@Id
	@GeneratedValue	
	@Column(name="student_id")
	public int getStudenID() {
		return studenID;
	}
	
	public void setStudenID(int studenID) {
		this.studenID = studenID;
	}
	@Column(name="student_name")
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Column(name="parent_id")
	@ManyToOne(targetEntity=Parent.class)
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	@Column(name="aadhar_number")
	public String getAADHAR() {
		return AADHAR;
	}
	public void setAADHAR(String aADHAR) {
		AADHAR = aADHAR;
	}
	@Column(name="branch_id")
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Column(name="gender")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Column(name="dob")
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Column(name="joiningDate")
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
	
	
}
