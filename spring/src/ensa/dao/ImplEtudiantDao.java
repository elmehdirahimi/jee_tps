package ensa.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ImplEtudiantDao implements EtudiantDao {

	@Override
	public void ajouterEtudiant(ensa.entities.Etudiant e) {
		// TODO Auto-generated method stub
		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(e);
		transaction.commit();
	}

	@Override
	public void supprimerEtudiant(int code) {
		// TODO Auto-generated method stub
		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		ensa.entities.Etudiant e = (ensa.entities.Etudiant) session.load(ensa.entities.Etudiant.class, code);
		session.delete(e);
		transaction.commit();
	}

	@Override
	public ensa.entities.Etudiant rechercherEtudiant(int code) {

		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		ensa.entities.Etudiant e = (ensa.entities.Etudiant) session.load(ensa.entities.Etudiant.class, code);
		return e;
	}

	@Override
	public List<ensa.entities.Etudiant> Etudiant() {
		SessionFactory SF = new Configuration().configure().buildSessionFactory();
		Session session = SF.openSession();
        org.hibernate.Query q = session.createQuery("from Etudiant");
		return  q.list();
	}

	public void initialisation() {
		System.out.println("implEtudiantDao est biens demarre");
	}
}
