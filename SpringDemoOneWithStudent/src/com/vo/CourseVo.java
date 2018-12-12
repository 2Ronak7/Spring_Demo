package com.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "course_master")
public class CourseVo {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "course_id")
    private long courseId;
	
	@Column(name = "course_name")
	private String courseName;

	@Transient
	private List<String> studentVo;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<String> getStudentVo() {
		return studentVo;
	}

	public void setStudentVo(List<String> studentVo) {
		this.studentVo = studentVo;
	}
	
	

}
