package samplehibernateexample;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import samplehibernateexample.entity.Student;
import samplehibernateexample.util.HibernateUtil;

public class TestHibernate {
	public static void main(String...args) {
		Student student = new Student(1235L, "Rama", 67.5f);
		Student student1 = new Student(1245L, "Shiva", 88.7f);
		Transaction trans = null;
		try {
			Session dbSession = HibernateUtil.getSessionFactory().openSession();
			//start the transaction
			trans = dbSession.beginTransaction();
			//save the persistent object/student objects
			//save() method = insert statement in jdbc
			dbSession.save(student);
			dbSession.save(student1);
			trans.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

