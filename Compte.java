package first;
import java.util.ArrayList;

public class Compte {
	private double solde;
	private String nom;
	private String numcpt;
	
	public Compte(double solde, String nom, String numcpt) {
		this.nom = nom;
		this.numcpt = numcpt;
		this.solde = solde;
	}
	public String getNom() {
		return nom;
	}
	public double getSolde() {
		return solde;
	}
	public String getNumcpt() {
		return numcpt;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setsolde(double solde) {
		this.solde = solde;
	}
	public void setNumctp(String numcpt) {
		this.numcpt = numcpt;
	}
	
	public double cred(double mont) {
		this.solde += mont;
		return this.solde;
	}
	public double debit(double mont) {
		if (this.solde>=mont) {
			this.solde -= mont;
			return this.solde;
		}
		else System.out.println("solde insuffisant") ;
		
	}
	
	public void add(ArrayList<Compte> comptes, Compte compte) {
		comptes.add(compte);
	}

}
