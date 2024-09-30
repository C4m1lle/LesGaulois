package personnages;


public class Village { 
	private String nom; 
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) { 
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	} 
	public void setChef(Chef chef) { 
		this.chef = chef; 
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int refGaulois){
		return villageois[refGaulois];
	}
	public String getNom() { 
		return nom; 
	}
	 public void afficherVillageois(){
		 System.out.println("Dans le village du chef "+ chef.getNom()+" vivent les légendaires gaulois :");
		 for(int i = 0;i<nbVillageois;i++) {
			 System.out.println("-"+trouverHabitant(i).getNom());
		 }
	 }
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible",30);
		/*Gaulois gaulois = village.trouverHabitant(30);
		 Le Nous avons 30 places dans le village, or le villageois d'indice 30 et le 31 eme, on sort donc du tableau*/
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);

		/*Gaulois gaulois = village.trouverHabitant(1); 
		 System.out.println(gaulois);
		 null car il n'y a qu'asterix dans le village*/

		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}