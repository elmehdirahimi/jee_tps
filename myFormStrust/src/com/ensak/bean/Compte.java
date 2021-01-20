package com.ensak.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ensak.HibernateUtil;
import com.ensak.dao.Client;

public class Compte {
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String nom, String prenom, String courriel, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.courriel = courriel;
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCourriel() {
		return courriel;
	}
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String CreerCompte() {
		
		Session session = HibernateUtil.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();		
	
		Client cl= new Client(1l, "mehdi", "tttt");
		session.save(cl) ;
		transaction.commit();
		
		return "success";
	}
	
}
