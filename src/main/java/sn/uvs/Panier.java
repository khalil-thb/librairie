package sn.uvs;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	private List<Livre> elementsDansLePanier;
	
	public Panier() {
		this.elementsDansLePanier = new ArrayList<>();
	}

	public void ajouter(Livre... livresAAcheter) {
		for (Livre livre : livresAAcheter) {
			elementsDansLePanier.add(livre);
		}
	}

	public int taille() {
		return elementsDansLePanier.size();
	}

}
