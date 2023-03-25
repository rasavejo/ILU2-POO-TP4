package produit;

public abstract class Produit implements IProduit {
	private String nom;
	private String unite;
	
	
	@Override
	public String getNom() {
		return nom;
	}
	
	
	protected Produit(String nom, String unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}
	
	public double calculerPrix(double prix) {
		return prix;
	}




	@Override
	public String toString() {
		return nom + " en " + unite;
	}
	
}
