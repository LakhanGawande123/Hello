package com.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Student;
import com.util.HbUtil;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf = HbUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Student student = new Student();
		student.setName("qwerty");
		student.setAddress("Pune");
		
		session.save(student);
		session.beginTransaction().commit();
		
	}

}
