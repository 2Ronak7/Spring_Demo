package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_master")
public class StudentVo {

	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "student_id")
    private long studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_city")
	private String studentCity;
	
	@Column(name = "student_mob")
	private String studentMob;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private CourseVo courseVo;
	
	public CourseVo getCourseVo() {
		return courseVo;
	}

	public void setCourseVo(CourseVo courseVo) {
		this.courseVo = courseVo;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentMob() {
		return studentMob;
	}

	public void setStudentMob(String studentMob) {
		this.studentMob = studentMob;
	}
	
	

	
}
