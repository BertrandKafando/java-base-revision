package poo;

public class Compte {
    private double solde;
    private int numero;
    private static int nbComptes = 0;

    Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        nbComptes++;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public void debiter(double montant) {
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }

    public int getNumero() {
        return numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Compte [solde=" + solde + ", numero=" + numero + "]";
    }
}
