package fr.eni.demoPoo;

public class DemoBanque {

	public static void main(String[] args) {

		Banque banque = new Banque();
		
		Banque banqueBnp = new Banque("BNP", "Quimper", "Joli Logo VERT et BLANC", 5000000);

		Banque banqueLcl = new Banque("LCL", "Quimper", "Joli Logo VERT et JAUNE", 1000000);

		System.out.println(banqueBnp.toString());

		System.out.println(banqueLcl.toString());

		banqueLcl.setVille("Brest");
		
		// impossible les attributs sont private
		// banqueBnp.valeurEnBourse = 100;

		System.out.println(banqueLcl.getNom());
		System.out.println(banqueLcl.toString());
		
		System.out.println(Banque.getPays());
	}

}
