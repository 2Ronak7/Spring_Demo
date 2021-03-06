package com.dao;

import java.util.List;

import com.vo.StudentVo;

public interface StudentDao {

	public StudentVo insertStudent(StudentVo studentVo);
	public List viewStudent();
	public StudentVo deleteStudent(StudentVo studentVo);
	public List editStudent(StudentVo studentVo);
	public StudentVo updateStudent(StudentVo studentVo);
	public List detailofStudent(StudentVo studentVo);
}
