package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CourseDaoImpl implements CourseDao
{
	@Autowired
	SessionFactory sf;

	@Override
	public List getCourseList() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query query = session.createQuery("from CourseVo");
		List list = query.list();
		return list;
	}

}
