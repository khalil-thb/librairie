package sn.uvs;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	private List<Livre> elementsDansLePanier;
	public double prixDuPanier;
	
	public Panier() {
		this.elementsDansLePanier = new ArrayList<>();
	}

	public int recupererNombreDeLivres() {
		return elementsDansLePanier.size();
	}

	public void ajouter(Livre livreAAcheter, int quantite) {
		elementsDansLePanier.add(livreAAcheter);
		double prix = livreAAcheter.getPrix();
		if (quantite == 1) {
			prixDuPanier = prixDuPanier + prix;
		}
		if(quantite == 2) {
			prixDuPanier = (prix * quantite) - (prix * quantite * 0.05);
		}
		if (quantite >= 3) {
			prixDuPanier = (prix * quantite) - (prix * quantite * 0.25);
		}
	}

}
