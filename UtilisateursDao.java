package biblio.dao;

import java.util.ArrayList;

import biblio.domain.Utilisateur;

// Cette classe permet l'acc�s aux donn�es (DAO)

public class UtilisateursDao {

	
	Utilisateur util1 = new Utilisateur ("Alex", "Cerise", 001);
	Utilisateur util2 = new Utilisateur ("Aur�lie", "Letoux", 002);
	Utilisateur util3 = new Utilisateur ("Christophe", "Fleury", 003);
	Utilisateur util4 = new Utilisateur ("D�borah", "Smits", 004);		
	
	
	// ArrayList qui simule la BDD des utilisateurs de la biblioth�que
	private ArrayList <Utilisateur> utilisateursDB = new ArrayList <Utilisateur>() {{
		add(util1);
		add(util2);
		add(util3);
		add(util4);
	}};
	
	
	
	// M�thode qui retourne l'utilisateur par son idUtilisateur
//	public Utilisateur findByKey(int idUtilisateur) {
//		for (int i = 0 ; i < utilisateursDB.size() ; i++) {
//			if (utilisateursDB.get(idUtilisateur)) 
//				return utilisateursDB.toString();
//		}
//		return null;
//	}
	
	
	
}
