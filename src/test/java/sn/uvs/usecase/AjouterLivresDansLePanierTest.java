package sn.uvs.usecase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import sn.uvs.Livre;
import sn.uvs.Panier;

class AjouterLivresDansLePanierTest {
	
	Livre livre1 = new Livre("Clean Code");
	Livre livre2 = new Livre("OCA Java SE 8 Programmer");
	Livre livre3 = new Livre("Le Coran");
	Livre livre4 = new Livre("Comment se faire des amis");
	Livre livre5 = new Livre("Sidi et Rama");
	

	@Test
	void testAjoutDUnLivreDansLePanier() {
		
		Panier panier = new Panier();
		
		panier.ajouter(livre1, 1);

		assertThat(panier.recupererNombreDeLivres()).isEqualTo(1);
	}
	
	@Test
	void testAjoutDeDeuxLivresDansLePanier() {
		Panier panier = new Panier();
		
		panier.ajouter(livre1, 3);
		panier.ajouter(livre2, 1);
		
		assertThat(panier.recupererNombreDeLivres()).isEqualTo(2);	
	}
	
	
	@Test
	void testAjoutDeNLivresDansLePanier() {
		Panier panier = new Panier();
		
		panier.ajouter(livre1, 1);
		panier.ajouter(livre2, 1);
		panier.ajouter(livre3, 1);
		
		assertThat(panier.recupererNombreDeLivres()).isEqualTo(3);	
	}
}
