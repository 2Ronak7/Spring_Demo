package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService
{
	@Autowired
	CourseDao courseDao;

	@Override
	public List getCourseList() {
		// TODO Auto-generated method stub
		return courseDao.getCourseList();
	}

}
