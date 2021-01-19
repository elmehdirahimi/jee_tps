package ensa.metier;

import java.util.List;

import ensa.dao.EtudiantDao;
import ensa.dao.ImplEtudiantDao;
import ensa.entities.Etudiant;

public class ImpEtudiantMetier implements EtudiantMetier{
	private EtudiantDao dao;
	@Override
	public void addEtudiant(Etudiant e) {
		dao.ajouterEtudiant(e);
	}

	@Override
	public void deleteEtudiant(int code) {
		dao.supprimerEtudiant(code);
	}

	@Override
	public Etudiant getEtudiant(int code) {
		return dao.rechercherEtudiant(code);
	}

	@Override
	public List<Etudiant> getAllEtudiant() {
		return dao.Etudiant();
	}

	public EtudiantDao getDao() {
		return dao;
	}

	public void setDao(EtudiantDao dao) {
		this.dao = dao;
	}

}
