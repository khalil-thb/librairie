package sn.uvs.usecase;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import sn.uvs.Livre;
import sn.uvs.Panier;

class AjouterLivresDansLePanierTest {

	@Test
	void testAjoutLivreDansLePanier() {
		
		// ajout d'un élément dans le panier
		// ajouter(Arrays.asList(new Livre("Clean Code", 8)));
		
		Panier panier = new Panier(Collections.singletonList(new Livre("Clean Code", 8)));
		
		// verifier que le panier contient un livre
		assertThat(panier.taille()).isEqualTo(1);
	}
	
	@Test
	void testAjoutDeDeuxLivresDansLePanier() {
		List<Livre> listeDeLivres = new ArrayList<>();
		Livre cleanCode = new Livre("Clean Code", 8);
		Livre certificationJava = new Livre("OCA Java SE 8 Programmer", 8);
		
		listeDeLivres.add(cleanCode);
		listeDeLivres.add(certificationJava);
		
		Panier panier = new Panier(listeDeLivres);
		
		assertThat(panier.taille()).isEqualTo(2);	
	}
	
	@Test
	void testAjoutDeCinqLivresDansLePanier() {
		List<Livre> listeDeLivres = new ArrayList<>();
		Livre cleanCode = new Livre("Clean Code", 8);
		Livre certificationJava = new Livre("OCA Java SE 8 Programmer", 8);
		Livre commentSeFaireDesAmis = new Livre("Comment se faire des amis", 8);
		Livre sidiEtRama = new Livre("Sidi et Rama", 8);
		Livre voyageNocturne = new Livre("Voyage Nocturne", 8);
		
		listeDeLivres.add(cleanCode);
		listeDeLivres.add(certificationJava);
		listeDeLivres.add(commentSeFaireDesAmis);
		listeDeLivres.add(sidiEtRama);
		listeDeLivres.add(voyageNocturne);
		
		Panier panier = new Panier(listeDeLivres);
		
		assertThat(panier.taille()).isEqualTo(5);	
	}
}
