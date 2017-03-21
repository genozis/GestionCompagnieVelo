package eseo.grouped.serviceweb;

public class Velo {
	
	
	
	int codeVelo;
	String categorie;
	String ville;
	float prixLocation;
	
	//Constructor
	
	public Velo() {
		this(0,"none","none",0);
	}
	
	public Velo(int codeVelo, String categorie, String ville, float prixLocation) {
		this.codeVelo = codeVelo;
		this.categorie = categorie;
		this.ville = ville;
		this.prixLocation = prixLocation;
	}
	
	public Velo(String codeVelo, String categorie, String ville, String prixLocation){
		this(Integer.parseInt(codeVelo),categorie,ville,Float.parseFloat(prixLocation));
	}
	
	public static Velo[] tableDeVelo(String[][] tab){
		int ligne =tab.length;		
		Velo[] velo = new Velo[ligne];
		for (int i =0; i<ligne;i++){
				velo[i] = new Velo(tab[i][0],tab[i][1],tab[i][2],tab[i][3]);
		}
		return velo;
	}
	
	
	// Getter and Setter
	
	//codeVelo
	public int getCodeVelo() {
		return codeVelo;
	}
	public void setCodeVelo(int codeVelo) {
		this.codeVelo = codeVelo;
	}
	
	//Categorie
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	//Ville
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	//Prix location
	public float getPrixLocation() {
		return prixLocation;
	}
	public void setPrixLocation(float prixLocation) {
		this.prixLocation = prixLocation;
	}
	
	
	
}
