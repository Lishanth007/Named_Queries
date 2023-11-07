package jpqlQuery;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import jakarta.persistence.TypedQuery;

public class NQ_main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(kollywood.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		Transaction ts = ses.beginTransaction();
		// Named_Query implement..
		TypedQuery query = ses.getNamedQuery("IdentifyById");
		TypedQuery query2 = ses.getNamedQuery("AnotherNQ");

		query.setParameter("ActorId", 2);
		query2.setParameter("ActorId", 1);

		// getResultList-Select statement is getting Executed
		List<kollywood> kolly = query.getResultList();
		List<kollywood> kolly2 = query2.getResultList();

		Iterator<kollywood> iter = kolly.iterator();
		Iterator<kollywood> iter2 = kolly2.iterator();

		while (iter2.hasNext()) {

			kollywood k = iter2.next();
			System.out.println(k);
			while (iter.hasNext()) {

				kollywood k1 = iter.next();
				System.out.println(k1);
			}
		}

		ses.close();

	}

}
