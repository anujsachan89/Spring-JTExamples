package controller;

import java.util.Date;
import java.util.List;

public class Student {

	private String studentName;
	private String studentHobby;
	private long studentMobile;
	private Date studentDOB;
	private List<String> studentSkills;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
}