package tp;

public class Maison extends Batiment{
	int nbPieces;
	double surfaceJ;
	
	public Maison(String adresse, double surfaceHabitable, int nbPieces, double surfaceJ) {
		super(adresse, surfaceHabitable);
		this.nbPieces = nbPieces;
		this.surfaceJ = surfaceJ;

	}
	public String toString() {
		return "adresse: " + this.adresse + " surfaceHabitable: " + this.surfaceHabitable + " nbP: " + this.nbPieces + " surfaceJardin " + this.surfaceJ ;	
				}

}
