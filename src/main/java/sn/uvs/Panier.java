package sn.uvs;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	private List<Livre> elementsDansLePanier;
	public double prixDuPanier;
	
	public Panier() {
		this.elementsDansLePanier = new ArrayList<>();
	}

	public void ajouter(Livre... livresAAcheter) {
		for (Livre livre : livresAAcheter) {
			elementsDansLePanier.add(livre);
		}
		if (elementsDansLePanier.size() == 1) {
			this.prixDuPanier = 8;
		}
		if (elementsDansLePanier.size() == 2 && elementsDansLePanier.get(0).getName().equals(elementsDansLePanier.get(1).getName())) {
			this.prixDuPanier = 16 - (16 * 0.05);
		}
	}

	public int recupererNombreDeLivres() {
		return elementsDansLePanier.size();
	}

}
