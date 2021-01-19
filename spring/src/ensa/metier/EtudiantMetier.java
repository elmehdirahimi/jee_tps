package ensa.metier;

import java.util.List;

import ensa.dao.EtudiantDao;
import ensa.entities.Etudiant;

public interface EtudiantMetier {

	public void addEtudiant(Etudiant e);
	public void deleteEtudiant(int code);
	public Etudiant getEtudiant(int code);
	public  List<ensa.entities.Etudiant> getAllEtudiant();
}
