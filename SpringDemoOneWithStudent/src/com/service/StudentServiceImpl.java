package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.vo.StudentVo;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentDao studentDao;

	@Override
	public StudentVo insertStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		System.out.println("in implemention of service,,,,,,,,,,,,,,,,,,,,,");
		return studentDao.insertStudent(studentVo);
	}

	@Override
	public List viewStudent() {
		// TODO Auto-generated method stub
		System.out.println("in view method of service .....................................");
		return studentDao.viewStudent();
	}

	@Override
	public StudentVo deleteStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		System.out.println("in delete method of service........................");
		return studentDao.deleteStudent(studentVo);
	}

	@Override
	public List editStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		return studentDao.editStudent(studentVo);
	}

	@Override
	public StudentVo updateStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(studentVo);
	}

	@Override
	public List detailofStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		return studentDao.detailofStudent(studentVo);
	}

}
