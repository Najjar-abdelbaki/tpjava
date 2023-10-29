package first;

public class Rectangle {
	private int largeur;
	private int longueur;
	public Rectangle(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	@Override
	public String toString() {
		return "Rectangle [largeur=" + largeur + ", longueur=" + longueur + "]";
	}

}
