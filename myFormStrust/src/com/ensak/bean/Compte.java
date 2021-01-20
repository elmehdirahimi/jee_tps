package com.ensak.bean;

import java.io.Console;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ensak.HibernateUtil;
import com.ensak.dao.Client;



public class Compte {
	
	int code;
	String nom;
	String ville;

	public Compte(int code, String nom, String ville) {
	super();
	this.code = code;
	this.nom = nom;
	this.ville = ville;
}


	public int getCode() {
	return code;
}


public void setCode(int code) {
	this.code = code;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getVille() {
	return ville;
}


public void setVille(String ville) {
	this.ville = ville;
}


	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String CreerCompte() {
		
		Session session = HibernateUtil.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();		
		Client cl= new Client((long) code, nom, ville);
		session.save(cl) ;
		transaction.commit();
		return "success";
	}
	
	
public String affichage() {
		
	SessionFactory SF = new Configuration().configure().buildSessionFactory();
	Session session = SF.openSession();
    org.hibernate.Query q = session.createQuery("from Etudiant");
	return  q.list();
	
		return "success";
	}
	
}
