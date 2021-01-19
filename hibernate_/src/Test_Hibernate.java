import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dao.Client;

/**
 * @author el mehdi
 *
 */
public class Test_Hibernate {

	public static void main(String[] args) {
		Session session = HibernateUtil.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();		
	
		Client cl=(Client) session.load(Client.class,2l);
		session.delete(cl) ;
		
		transaction.commit();
	}

}
