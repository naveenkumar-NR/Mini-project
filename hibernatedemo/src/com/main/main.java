package com.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bean.student;

public class main {
	public static void main(String args[]) {
		student st=new student();
		st.setS_id(10);
		st.setName("NAVEEN");
		st.setAdress("KARUR");
		st.setMarks(100);
		Configuration cfg=new Configuration();
		cfg.configure("Resources/NewFile.cfg.xml");
		SessionFactory ss=cfg.buildSessionFactory();
		Session sess=ss.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(st);
		tr.commit();
	}
}
