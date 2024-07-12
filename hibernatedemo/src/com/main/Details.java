//package com.main;
//
//public class Details {
//
//}
package com.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bean.StudentDetails;

public class Details {
	public static void main(String args[]) {
		StudentDetails st1=new StudentDetails(01, "Naveen", "Kolkata");
		StudentDetails st2=new StudentDetails(02, "Rishi", "Kerala");
		StudentDetails st3=new StudentDetails(03, "Mokesh", "Tamilnadu");
		StudentDetails st4=new StudentDetails(04, "Miran", "Karnataka");
	
		Configuration cfg=new Configuration();
		cfg.configure("Resources/NewFile.cfg.xml");
		SessionFactory ss=cfg.buildSessionFactory();
		Session sess=ss.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(st1);
		sess.save(st2);
		sess.save(st3);
		sess.save(st4);
		Object objdata=sess.load(StudentDetails.class,new Integer(01));
		StudentDetails getdata=(StudentDetails) objdata;
		getdata.setS_Add("Delhi");
		System.out.println(getdata);
		tr.commit();
	}
}

