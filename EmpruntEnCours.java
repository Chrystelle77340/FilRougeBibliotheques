package biblio.domain;

import java.time.LocalDate;

public class EmpruntEnCours {

	
	// VARIABLES
	
	private LocalDate dateEmprunt;
	
	private Utilisateur utilisateur;		// 1 seul utilisateur  par EmpruntEnCours
	
	private Exemplaire exemplaire;			// 1 seul exemplaire par EmpruntEnCours
	
	
	
	
	// CONSTRUCTEURS
	
	public EmpruntEnCours() {
		super();
	}
	
	
	public EmpruntEnCours(LocalDate dateEmprunt, Utilisateur utilisateur, Exemplaire exemplaire) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.utilisateur = utilisateur;
		this.exemplaire = exemplaire;
	}
	
	
	// GETTERS ET SETTERS
	
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}


	// METHODES
	
	@Override
	public String toString() {
		return "EmpruntEnCours [dateEmprunt = " + dateEmprunt + ", utilisateur = " + utilisateur + ", exemplaire = " + exemplaire + "]";
	}
	
	
	public void empruntEnCours(Utilisateur utilisateur, Exemplaire exemplaire, LocalDate dateEmprunt) {
		this.utilisateur = utilisateur;
		this.exemplaire = exemplaire;
		this.dateEmprunt = dateEmprunt;
	}


	
	
	public static void main(String[] args) {
		
		

	}
	

}
