package tp;

public class Batiment {
	String adresse;
	double surfaceHabitable;
	
	public Batiment(String adresse, double surfaceHabitable) {
		this.adresse = adresse;
		this.surfaceHabitable = surfaceHabitable;
	}
	
	public String toString() {
		return "adress: " + this.adresse + " surface: " + this.surfaceHabitable ;
	}

}
