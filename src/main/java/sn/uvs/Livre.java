package sn.uvs;

public class Livre {
	
	private static double prix = 8;
	private String name;

	public Livre(String nomLivre) {
		this.name = nomLivre;
	}

	public String getName() {
		return name;
	}
	
	public double getPrix() {
		return prix;
	}

}
