import java.util.*;
public class Operation {
    private String type;
    private double montant;
    private Date date;
    private Compte compteAssocie;

    public Operation (String type,double montant,Date date, Compte compteAssocie){
        this.type=type;
        this.montant=montant;
        this.date=date;
        this.compteAssocie=compteAssocie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Compte getCompteAssocie() {
        return compteAssocie;
    }

    public void setCompteAssocie(Compte compteAssocie) {
        this.compteAssocie = compteAssocie;
    }
    static  Scanner  scanner = new Scanner(System.in);
    public static void depot(){
        Compte compte = Compte.rechercheCompte();
        if(compte == null){
            System.out.println("Compte introuvable !");

        }else {
            System.out.println("entrer le montant que vous voulez deposer :");
            double montant = scanner.nextDouble();

                montant = compte.getSolde() + montant;
                compte.setSolde(montant);
            System.out.println("Montant déposer !");

        }
    }
    public static void retrait(){
        Compte compte = Compte.rechercheCompte();
        if(compte==null){
            System.out.println("Compte introuvable !");
        }else {
            System.out.println("Montant du retrait :");
            double montant = scanner.nextDouble();
            if(compte.getSolde()>montant){
                montant = compte.getSolde() - montant;
                compte.setSolde(montant);
                System.out.println("Montant retraiter !");
            }else {
                System.out.println("Le solde est insuffisant !");

            }

        }
    }




    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                ", compteAssocie=" + compteAssocie +
                '}';
    }

}
