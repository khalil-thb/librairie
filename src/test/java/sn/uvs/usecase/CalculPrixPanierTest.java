package sn.uvs.usecase;

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

	@DisplayName("calculer le prix du panier pour un livre ajouté")
	@Test
	void testCalculPrixPanierPourUnLivre() {
		Panier panier = new Panier();
		
		panier.ajouter(livre4, 1);
		
		assertThat(panier.prixDuPanier).isEqualTo(8);
	}
	
	@DisplayName("calculer le prix du panier pour deux livres non identiques")
	@Test
	void testCalculPrixPanierPourDeuxLivresNonIdentiques() {
		Panier panier = new Panier();
		
		panier.ajouter(livre4, 1);
		panier.ajouter(livre5, 1);
		
		assertThat(panier.prixDuPanier).isEqualTo(16);
	}
	
	@DisplayName("calculer le prix du panier pour trois livres non identiques")
	@Test
	void testCalculPrixPanierPourTroisLivresNonIdentiques() {
		Panier panier = new Panier();
		
		panier.ajouter(livre3, 1);
		panier.ajouter(livre4, 1);
		panier.ajouter(livre5, 1);
		
		assertThat(panier.prixDuPanier).isEqualTo(24);
	}

	
	@DisplayName("calculer le prix du panier pour deux livres identiques")
	@Test
	void testCalculPrixPanierPourDeuxLivresIdentiques() {
		Panier panier = new Panier();
		
		panier.ajouter(livre1, 2);
		
		assertThat(panier.prixDuPanier).isEqualTo(15.2);
	}
	
	@DisplayName("calculer le prix du panier pour trois livres identiques")
	@Test
	void testCalculPrixPanierPourTroisLivresIdentiques() {
		Panier panier = new Panier();
		
		panier.ajouter(livre2, 3);
		
		assertThat(panier.prixDuPanier).isEqualTo(18);
	}
	
	@DisplayName("calculer le prix du panier pour trois livres identiques")
	@Test
	void testCalculPrixPanierPourQuatreLivresIdentiques() {
		Panier panier = new Panier();
		
		panier.ajouter(livre2, 4);
		
		assertThat(panier.prixDuPanier).isEqualTo(24);
	}	
	
}
