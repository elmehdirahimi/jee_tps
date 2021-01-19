package com.dao;

public class Client {

	Long code;
	String nom;
	String prenom;
	Integer age;
	String ville;
	
	
	public Client(Long code, String nom, String prenom, Integer age, String ville) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
}
