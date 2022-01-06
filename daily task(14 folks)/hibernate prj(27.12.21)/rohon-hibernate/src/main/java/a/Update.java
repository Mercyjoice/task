package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class Update {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		System.out.println("got a sessionfactory  " + factory);

		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Emp e = (Emp) s.get(Emp.class, 1);
		System.out.println(e.getId() + "   " + e.getName() + "   " + e.getAddress());
		e.setAddress("KOLKATA");
		s.update(e);
		tr.commit();
		s.close();
		System.out.println("data changed!!!!");

	}
}
