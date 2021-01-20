package com.ensak.dao;


public class Client {

	Long code;
	String nom;
	String ville;
	
	

	public Client(Long code, String nom, String ville) {
		super();
		this.code = code;
		this.nom = nom;
		this.ville = ville;
	}
	public Client() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
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
}
