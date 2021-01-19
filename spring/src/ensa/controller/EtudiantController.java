package ensa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ensa.dao.ImplEtudiantDao;
import ensa.entities.Etudiant;
import ensa.metier.EtudiantMetier;
import ensa.metier.ImpEtudiantMetier;

@Controller
public class EtudiantController {
	
	@Autowired
	private EtudiantMetier etudiantMetier;
	
	@RequestMapping(value="/index1")
	public String indexEtud(Model model){
		model.addAttribute("listeE",etudiantMetier.getAllEtudiant());
		return "index";
	}
	
	
	@RequestMapping(value="/saveE")
	public String saveEtud(Model model,
			@RequestParam(value="codeEtud") int code, 
			@RequestParam(value="nomEtud")String nom, 
			@RequestParam(value="prenomEtud") String prenom, 
			@RequestParam(value="ageEtud") int age){
		
		Etudiant e = new Etudiant(code,nom,prenom,age);
		etudiantMetier.addEtudiant(e);
		
		model.addAttribute("listeE",etudiantMetier.getAllEtudiant());
		return "index";
	}
	
	@RequestMapping(value="/RechE")
	public String RechEtud(Model model,
			@RequestParam(value="codeEtud") int code){
		List<Etudiant> LE = new ArrayList<>();
		
		LE.add(etudiantMetier.getEtudiant(code));
		
		model.addAttribute("listeE",LE);
		return "index";
	}
	
	@RequestMapping(value="/deleteE")
	public String delEtud(Model model,
			@RequestParam(value="codeE") int code){
		etudiantMetier.deleteEtudiant(code);
		model.addAttribute("listeE",etudiantMetier.getAllEtudiant());
		return "index";
	}
}
