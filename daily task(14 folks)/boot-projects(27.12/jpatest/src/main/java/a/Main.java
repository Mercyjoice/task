package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		c = c.configure();
		System.out.println("CFG is loaded " + c);
		SessionFactory sf = c.buildSessionFactory();
		System.out.println("loaded  " + sf);
		Student s = new Student();
		s.setId(100);
		s.setName("Mercy");
		s.setAddress("Kolkata");
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(s);
		tr.commit();
		ss.close();
		System.out.println("Object has been saved check Oracle....");

	}

}
