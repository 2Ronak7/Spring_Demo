package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vo.StudentVo;

@Component
@Transactional
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	SessionFactory sf;
	
	@Override
	public StudentVo insertStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		System.out.println("in dao implementation method.............................");
		Session session = sf.getCurrentSession();
		session.save(studentVo);
		return studentVo;
	}

	@Override
	public List viewStudent() {
		// TODO Auto-generated method stub
		System.out.println("in view method of dao implementation..........................");
		Session session = sf.openSession();
		Query query = session.createQuery("from StudentVo");
		List list = query.list();
		return list;
	}

	@Override
	public StudentVo deleteStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		System.out.println("in delete method of dao.........................");
		Session session = sf.openSession();
		Query query = session.createQuery("delete from StudentVo where studentId="+studentVo.getStudentId());
		query.executeUpdate();
		return studentVo;
	}

	@Override
	public List editStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query query = session.createQuery("from StudentVo where studentId="+studentVo.getStudentId());
		List list = query.list();
		System.out.println("list----------------->"+list.size());
		return list;
	}

	@Override
	public StudentVo updateStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		System.out.println("----------------->>>>>>>>>>>>DAO<<<<<<<<<<<<<<<<<--------------------");
		System.out.println("name------------>"+studentVo.getStudentName());
		System.out.println("city-------------->"+studentVo.getStudentCity());
		System.out.println("mob---------------->"+studentVo.getStudentMob());
		System.out.println("course----------->"+studentVo.getCourseVo().getCourseId());
		
		//session.update(studentVo);
		
		Query query = session.createQuery("update StudentVo set studentName='"+studentVo.getStudentName()+"',studentCity='"+studentVo.getStudentCity()+"',studentMob='"+studentVo.getStudentMob()+"',courseVo='"+studentVo.getCourseVo().getCourseId()+"' where studentId="+studentVo.getStudentId());
		query.executeUpdate();
		return studentVo;
		
		//Query query = session.createQuery("update StudentVo set studentName='"+studentVo.getStudentName()+"',studentCity='"+studentVo.getStudentCity()+"',studentMob='"+studentVo.getStudentMob()+"' where studentId='"+studentVo.getStudentId()+"'");
		//query.executeUpdate();
		
	}

	@Override
	public List detailofStudent(StudentVo studentVo) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query query = session.createQuery("from StudentVo where studentId="+studentVo.getStudentId());
		List list = query.list();
		return list;
	}
	
}
