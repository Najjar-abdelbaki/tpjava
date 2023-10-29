package tp;

public class main {

	public static void main(String[] args) {
		//Batiment b = new Batiment("Tataouin", 500);
		//System.out.println(b.toString());
		//Maison m = new Maison("Tataouine", 500, 4, 10);
		Maison[] tB = new Maison[10];
		
		//for (int i =0 ; i < 10; i++) {
		//	tB[i] = new Batiment("Tata", 400);
		//}
		
		//tB[1] = new Batiment("Mednin", 600);
		tB[2] = new Maison("kas",4,4,3);
		
		for (int i =0 ; i < 10; i++) {
			System.out.println(tB[i]);
		}
		
		
	}

}
