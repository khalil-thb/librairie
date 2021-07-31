package sn.uvs.usecase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sn.uvs.Livre;
import sn.uvs.Panier;
import static org.assertj.core.api.Assertions.assertThat;

class CalculPrixPanierTest {
	
	Livre livre1 = new Livre("Clean Code");
	Livre livre2 = new Livre("OCA Java SE 8 Programmer");
	Livre livre3 = new Livre("Le Coran");
	Livre livre4 = new Livre("Comment se faire des amis");
	Livre livre5 = new Livre("Sidi et Rama");
	
	Panier panier;
	
	@BeforeEach
	void initialiser() {
		panier = new Panier();
	}
	

	@DisplayName("calculer le prix du panier pour un livre ajouté")
	@Test
	void calculPrixDuPanierPourUnLivre() {	
		
		quandJajouteXLivresDansMonPanier(livre1, 1);
		
		AlorsLePrixDuPanierEstEgalA(8);
	}
	
	@DisplayName("calculer le prix du panier pour deux livres non identiques")
	@Test
	void calculPrixDuPanierPourDeuxLivresNonIdentiques() {
		
		quandJajouteXLivresDansMonPanier(livre4, 1);
		quandJajouteXLivresDansMonPanier(livre5, 1);
		
		AlorsLePrixDuPanierEstEgalA(16);
	}

	
	@DisplayName("calculer le prix du panier pour deux livres identiques")
	@Test
	void testCalculPrixPanierPourDeuxLivresIdentiques() {
		
		quandJajouteXLivresDansMonPanier(livre1, 2);
		
		AlorsLePrixDuPanierEstEgalA(15.2);
	}
	
	@DisplayName("calculer le prix du panier pour trois livres identiques")
	@Test
	void testCalculPrixPanierPourTroisLivresIdentiques() {
		
		quandJajouteXLivresDansMonPanier(livre2, 3);
		
		AlorsLePrixDuPanierEstEgalA(18);
	}	
	
	@DisplayName("calculer le prix du panier en fonction des livres ajoutes")
	@Test
	void testCalculPrixPanierEnFonctionDesLivresAjoutes() {
		
		quandJajouteXLivresDansMonPanier(livre1, 2);
		quandJajouteXLivresDansMonPanier(livre2, 3);
		quandJajouteXLivresDansMonPanier(livre3, 4);
		quandJajouteXLivresDansMonPanier(livre4, 1);
		quandJajouteXLivresDansMonPanier(livre5, 1);
		
		AlorsLePrixDuPanierEstEgalA(73.20);
	}
	
	private void AlorsLePrixDuPanierEstEgalA(double prixDuPanier) {
		assertThat(panier.prixDuPanier).isEqualTo(prixDuPanier);
	}


	private void quandJajouteXLivresDansMonPanier(Livre livre, int quantite) {
		panier.ajouter(livre, quantite);
	}
	
}
