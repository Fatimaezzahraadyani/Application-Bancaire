import java.util.Scanner;

public class CompteCourant extends Compte{
    private double fraisbancaire;

    public CompteCourant(String num, double solde, Client proprietaire, double fraisbancaire) {
        super(num, solde, proprietaire);
        this.fraisbancaire = fraisbancaire;
    }

    public double getFraisbancaire() {
        return fraisbancaire;
    }

    public void setFraisbancaire(double fraisbancaire) {
        this.fraisbancaire = fraisbancaire;
    }

    @Override
    public String toString() {
        return "CompteCourant : " + super.toString() +
                "fraisbancaire = " + fraisbancaire ;
    }
}


