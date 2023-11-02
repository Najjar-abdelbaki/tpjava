package rev;

public class Document {
	private String titre;
	private int num;
	
	static int numSt = 0;
	
	public Document(String titre) {
		this.titre = titre;
		this.num = this.numSt;
		this.numSt ++;
	}
	public Document (String titre, int num) {
		this.titre = titre;
		if (num < numSt) {
			num = numSt;
		}
		this.num = num;
		this.numSt = num +1 ;
		this.titre = titre;
		
	}
	
	
	
	public String getTitre() {
		return this.titre;
	}
	public int getNum() {
		return num;
	}
	public int getNumSt() {
		return numSt;
	}
	
	public String toString() {
		return "titre: " + titre + " numero: " + num;
	}
}
