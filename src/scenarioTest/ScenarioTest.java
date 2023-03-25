package scenarioTest;

import personnages.Gaulois;
import produit.*;
import villagegaulois.*;

public class ScenarioTest {
	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal<Sanglier> etalSanglier = new Etal();
		Etal<Sanglier> etalSanglier2 = new Etal();
		Etal<Poisson> etalPoisson = new Etal();
		
		etalSanglier.installerVendeur(obelix, sangliersObelix, 8);
		etalSanglier2.installerVendeur(asterix, sangliersAsterix, 10);
		etalPoisson.installerVendeur(ordralfabetix, poissons, 7);
		
		System.out.println(etalSanglier.etatEtal());
		System.out.println(etalSanglier2.etatEtal());
		System.out.println(etalPoisson.etatEtal());

		etalSanglier2.acheterProduit(2);
		etalSanglier.acheterProduit(1);
		System.out.println(etalSanglier.etatEtal());
		System.out.println(etalSanglier2.etatEtal());
		
	}
	
}
