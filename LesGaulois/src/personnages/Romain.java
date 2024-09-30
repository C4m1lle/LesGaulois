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
			System.out.println("Le soldat " +nom+ " est déjà bien protégé !");
		}
		switch(equipement) {
		case BOUCLIER:
			if (nbEquipement == 0 || (nbEquipement == 1 && equipements[0]!=Equipement.BOUCLIER)) {
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + ".");
			}
			else if(nbEquipement == 1){
				System.out.println("Le soldat "+nom+ " possède déjà un casque");
				}
			break;
		case CASQUE:
			if (nbEquipement == 0 || (nbEquipement == 1 && equipements[0]!=Equipement.BOUCLIER)) {
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + ".");
				}
				else if(nbEquipement == 1){
					System.out.println("Le soldat "+nom+ " possède déjà un bouclier");
					}
			break;
		}

	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.parler("ROOOHHH");
		minus.recevoirCoup(4);
		minus.recevoirCoup(4);
	}
}
