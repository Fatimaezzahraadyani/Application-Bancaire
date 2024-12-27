public class CompteEpargne extends Compte{
    private double tauxInteret;


    public CompteEpargne(String num, double solde, Client proprietaire, double tauxInteret) {
        super(num, solde, proprietaire);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return "CompteEpargne :" + super.toString() +
                "  tauxInteret=" + tauxInteret ;
    }
}
