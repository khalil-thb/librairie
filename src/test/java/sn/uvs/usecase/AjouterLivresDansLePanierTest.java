package sn.uvs.usecase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import sn.uvs.Livre;
import sn.uvs.Panier;

class AjouterLivresDansLePanierTest {

	@Test
	void testAjoutDUnLivreDansLePanier() {
		
		Panier panier = new Panier();
		
		panier.ajouter(new Livre("Clean Code"));

		assertThat(panier.recupererNombreDeLivres()).isEqualTo(1);
	}
	
	@Test
	void testAjoutDeDeuxLivresDansLePanier() {
		Panier panier = new Panier();
		
		Livre cleanCode = new Livre("Clean Code");
		Livre certificationJava = new Livre("OCA Java SE 8 Programmer");
		Livre coran = new Livre("Le Coran");
		
		panier.ajouter(cleanCode, certificationJava);
		
		assertThat(panier.recupererNombreDeLivres()).isEqualTo(2);	
	}
	
	
	@Test
	void testAjoutDeNLivresDansLePanier() {
		// les livres de la bibliotheques
		Livre cleanCode = new Livre("Clean Code");
		Livre certificationJava = new Livre("OCA Java SE 8 Programmer");
		Livre commentSeFaireDesAmis = new Livre("Comment se faire des amis");
		Livre sidiEtRama = new Livre("Sidi et Rama");
		Livre voyageNocturne = new Livre("Voyage Nocturne");
		Livre apprendreACoder = new Livre("Apprendre à coder facilement");
		
		Panier panier = new Panier();
		
		panier.ajouter(cleanCode, certificationJava, apprendreACoder);
		
		assertThat(panier.recupererNombreDeLivres()).isEqualTo(3);	
	}
}
