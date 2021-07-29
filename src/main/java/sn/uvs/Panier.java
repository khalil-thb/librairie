package sn.uvs;

import java.util.List;

public class Panier {
	
	private List<Livre> livres;
	
	public Panier(List<Livre> livres) {
		this.livres = livres;
	}

	public int taille() {
		return livres.size();
	}

}
