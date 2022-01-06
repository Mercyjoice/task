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
public class MainInherit {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		System.out.println("got a sessionfactory  " + factory);

		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Employee e1 = new Employee();
		e1.setName("Rohon");
		System.out.println("employee created parent class done....");
		Regular_Employee e2 = new Regular_Employee();
		e2.setName("Vivek Kumar");
		e2.setSalary(50000);
		e2.setBonus(500);
		System.out.println("regular employee created child class one done....");

		Contract_Employee e3 = new Contract_Employee();
		e3.setName("Arjun Kumar");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("45 hours");
		System.out.println("Contract employee created child class two done....");

		s.save(e1);
		s.save(e2);
		s.save(e3);
		tr.commit();
		s.close();

		System.out.println("The object is saved in Oracle...............");

	}
}
