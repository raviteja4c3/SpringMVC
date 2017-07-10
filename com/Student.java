package com;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String studentId;
	private String studentName;
	private String studentRollNum;
	private String studentGrade;
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNum() {
		return studentRollNum;
	}
	public void setStudentRollNum(String studentRollNum) {
		this.studentRollNum = studentRollNum;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
}
