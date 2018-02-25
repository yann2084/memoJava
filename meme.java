
public class Ville {
	
	//**********  VARIABLES  **********
	
	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;
	
	
	//**********  CONSTRUCTEURS  **********
	
	//constructeur par défaut
	public Ville(){
		System.out.println("Création d'une ville!");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbreHabitants = 0;
		categorie = ' ';
		
	}
	
	//constructeur avec paramètres
	public Ville(String pNom, int pNbre, String pPays){
		System.out.println("Création d'une ville avec paramètres!");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategory();
	}
	
	//**********  ACCESSEURS  **********
	public String getNom(){
		return this.nomVille;
	}
	
	public String getNomPays(){
		return this.nomPays;
	}
	
	public int getNombreHabitants(){
		return this.nbreHabitants;
	}
	
	public char getCategorie(){
		return this.categorie;
	}
	
	//**********  MUTATEURS  **********
	public void setNom(String pNom){
		this.nomVille = pNom;
	}
	
	public void setNomPays(String pPays){
		this.nomPays =pPays;
	}
	
	public void setNbreHabitants(int pNbre){
		this.nbreHabitants = pNbre;
	}
	
	private void setCategory(){
		if (this.nbreHabitants < 1000) {
			this.categorie = 'A';
			
		} else if (this.nbreHabitants >= 1000 && this.nbreHabitants< 10000){
			this.categorie = 'B';

		}
	}
	
	
	
	public void afficheVille(Ville ville){
		System.out.println("Description de la ville" + ville.nomVille + " :");
		System.out.println("Nombre d'habitants : " + ville.nbreHabitants);
		System.out.println("Pays apparenté" + ville.nomPays);
		System.out.println("Catégorie" + ville.nomVille + " :");
	}

}

