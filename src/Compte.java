import java.util.ArrayList;
import java.util.Scanner;

public abstract class Compte {
    private String num;
    private double solde;
    private Client proprietaire;
    static ArrayList<Compte> comptes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public Compte(String num, double solde, Client proprietaire) {
        this.num = num;
        this.solde = solde;
        this.proprietaire = proprietaire;
    }

    public String getNum() {
        return num;
    }

    public void setNum() {
        this.num = num;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde() {
        this.solde = solde;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire() {
        this.proprietaire = proprietaire;
    }
    public static void CreeCompte() {

        System.out.println("entrer numéro de compte : ");
        String nmr = (sc.nextLine());
        System.out.println("entrer le solde initiale : ");
        double sld = sc.nextDouble();


        System.out.println("choisir le type de votre compte : " +
                "\n 1-Compte Epargne :" +
                "\n 2-Compte Courant :");
        int choix = sc.nextInt();
        if(choix==1){
            System.out.println("entrer le fraisbancaire : ");
            double fraisBancaire = sc.nextDouble();
            comptes.add(new CompteCourant(nmr, sld, Client.proprietaire(), fraisBancaire));

        } else if(choix==2){
            System.out.println("entrer le  tauxInteret : ");
            double  tauxInteret = sc.nextDouble();
            comptes.add(new CompteEpargne(nmr, sld, Client.proprietaire(), tauxInteret));

        }

    }
    public static void AfficherCompte(){
        for (Compte compte : comptes){
            compte.toString();
        }
    }
    public String toString() {
        return
                "num='" + num + '\'' +
                ", solde=" + solde +
                ", proprietaire='" + proprietaire.getNom() +" "+ proprietaire.getPrenom() ;
    }
}
