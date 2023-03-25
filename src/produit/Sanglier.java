package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier","kg");
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public double calculerPrix(double prix) {
		return (prix*poids)/1000;
	}
	
	@Override
	public String toString() {
		return "Sanglier de " + poids + " kg chasse par " + chasseur.getNom();
	}

}
