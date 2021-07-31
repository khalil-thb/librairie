package sn.uvs.usecase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sn.uvs.Livre;
import sn.uvs.Panier;
import static org.assertj.core.api.Assertions.assertThat;

class CalculPrixPanierTest {
	
	Livre cleanCode = new Livre("Clean Code");
	Livre jawahirouRassaili = new Livre("Jawahirou rassaili");

	@DisplayName("calculer le prix du panier pour un livre ajouté")
	@Test
	void testCalculPrixPanierPourUnLivre() {
		Panier panier = new Panier();
		
		panier.ajouter(cleanCode);
		
		assertThat(panier.prixDuPanier).isEqualTo(8);
	}
	
	@DisplayName("calculer le prix du panier pour deux livres identiques")
	@Test
	void testCalculPrixPanierPourDeuxLivresIdentiques() {
		Panier panier = new Panier();
		
		panier.ajouter(cleanCode, cleanCode);
		
		assertThat(panier.prixDuPanier).isEqualTo(15.2);
	}
	
	
}
