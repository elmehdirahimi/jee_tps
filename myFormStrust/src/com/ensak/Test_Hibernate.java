package com.ensak;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ensak.dao.Client;


/**
 * @author el mehdi
 *
 */
public class Test_Hibernate {

	public static void main(String[] args) {
		Session session = HibernateUtil.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();		
	
		Client cl= new Client(1l, "mehdi", "tttt");
		session.save(cl) ;
		transaction.commit();
	}

}
