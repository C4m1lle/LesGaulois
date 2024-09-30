package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0;
		int forcedeb = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert force < forcedeb;
	}

	private void sEquiper(Equipement equipement) {
		if (nbEquipement == 2){
			
		}
		switch(nbEquipement) {
		case 0,1:
			if (nbEquipement == 0 || equipements[0]!=equipement) {
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + ".");
				equipements[nbEquipement]=equipement;
				nbEquipement++;
				}
			else {
				System.out.println("Le soldat "+nom+ " possède déjà un " + equipement.getNom() + ".");
				}
			break;
		case 2:
			System.out.println("Le soldat " +nom+ " est déjà bien protégé !");
			break;
		}

	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.parler("ROOOHHH");
		minus.recevoirCoup(4);
		minus.recevoirCoup(4);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
