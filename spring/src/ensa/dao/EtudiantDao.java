package ensa.dao;

import java.util.List;

import ensa.entities.Etudiant;

public interface EtudiantDao {

	public void ajouterEtudiant(Etudiant e);
	public void supprimerEtudiant(int code);
	public Etudiant rechercherEtudiant(int code);
	public  List<ensa.entities.Etudiant> Etudiant();
}
