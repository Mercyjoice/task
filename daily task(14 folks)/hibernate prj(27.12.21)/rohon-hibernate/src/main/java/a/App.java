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
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		System.out.println("got a sessionfactory  " + factory);

		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Emp e = new Emp(1, "Rohon", "Delhi");
		s.save(e);// actually it will create the insert SQL
		tr.commit();
		s.close();
		System.out.println("The object is saved in Oracle...............");

	}
}
