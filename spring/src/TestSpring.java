import ensa.dao.EtudiantDao;
import ensa.dao.ImplEtudiantDao;
import ensa.entities.Etudiant;

public class TestSpring {

	public static void main(String[] args) {
		Etudiant etudiant = new Etudiant(1, "nom1", "prenom1", 10);
		EtudiantDao etudiantDao = new ImplEtudiantDao();
		System.out.println(etudiantDao.Etudiant());
	}
}
