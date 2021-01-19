package ensa.entities;

public class Etudiant {

	Integer code;
	String nom;
	String prenom;
	int age;
	public Etudiant(Integer code, String nom, String prenom, int age) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Etudiant [code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
