package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("poisson","Kilos");
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Poissons peche " + date;
	}
	
}
