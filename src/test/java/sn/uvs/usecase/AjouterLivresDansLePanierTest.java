package sn.uvs.usecase;

import org.junit.jupiter.api.Test;

import sn.uvs.Livre;
import sn.uvs.Panier;
import static org.assertj.core.api.Assertions.assertThat;

public class AjouterLivresDansLePanierTest {

	@Test
	void testAjoutLivreDansLePanier() {
		// initialisation
		Panier panier = new Panier();
		
		// ajout d'un élément dans le panier
		panier.add(new Livre("Clean Code", 8));
		
		// verifier que le panier contient un livre
		assertThat(panier.taille()).isEqualTo(1);
	}
}
