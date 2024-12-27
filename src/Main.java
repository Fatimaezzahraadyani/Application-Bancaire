import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Compte> comptes = new ArrayList<>();
    static ArrayList<Operation> operations = new ArrayList<>();

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int choix = 0;
        while (choix != 5) {
            System.out.println("\n ----Menu Principale---- \n"
                    + "\n (1).Gestion des Clients "
                    + "\n (2).Gestion des Comptes"
                    + "\n (3).Gestion des Opération"
                    + "\n (4).Effectuer un filtrage"
                    + "\n (5).Quitter ");
            System.out.println("choisir que vous voulez gérer : \n");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            try {
                switch (choix) {
                    case 1:
                        GestionClients();//menu gestion des clients
                        break;
                    case 2:
                        GestionComptes();//menu gestion des comptes
                        break;
                    case 3:
                        GestionOperation();//menu Gestion des Opération
                        break;
                    case 4:
                        //menu filtrage
                        break;
                    case 5:
                        System.out.println("Vous avez quitter !! ");
                        break;
                    default:
                        System.out.println("Merci d'entrer un choix valide ");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Reésseyer " + (e.getMessage()));
            }
        }
    }

        public static void GestionClients () {
            int s = 0;
            while (s != 3) {
                System.out.println("\n -------Gestion des Clients------- \n"
                        + "\n (1).Ajouter un Client "
                        + "\n (2).Afficher les clients"
                        + "\n (3).Retour au menu principale ");
                //System.out.println("choisir que vous voulez gérer : \n");
                Scanner scanner = new Scanner(System.in);
                s = scanner.nextInt();
                try {
                    switch (s) {
                        case 1:
                            clients.add(Client.Ajouterclient());//mthd ajouter cleint
                            break;
                        case 2:
                            for (Client client : clients ) {
                                Client.AfficherInfoClient(client); //mthd afficher cleint
                            }
                            break;
                        case 3:
                            System.out.println("vous avez quitter !");
                            break;
                        default:
                            System.out.println("Merci d'entrer un choix valide ");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Erreur " + e.getMessage());
                }
            }
        }
        public static void GestionComptes () {
            int choix = 0;
            while (choix != 4) {
                System.out.println("\n -------Gestion des Comptes------- \n"
                        + "\n (1).Créer un Compte "
                        + "\n (2).Afficher les infos"
                        + "\n (3).Associer pls compte à mm client"
                        + "\n (4).Retour au menu principale ");
                Scanner scanner = new Scanner(System.in);
                choix = scanner.nextInt();
                switch (choix) {
                    case 1:
                        Compte.CreeCompte();//mthd cree compte
                        break;
                    case 2:
                        Compte.AfficherCompte();//mthd afficher infos
                        break;
                    case 3:
                        //mthd associer
                        break;
                    case 4:
                        System.out.println("vous avez quitter");
                        break;
                    default:
                        System.out.println("Merci d'entrer un choix valide");
                        break;
                }
            }
        }
        public static void GestionOperation () {
            int sh = 0;
            while (sh != 5) {
                System.out.println("\n -------Gestion des Operation------- \n"
                        + "\n (1).Effectuer un dépôt "
                        + "\n (2).Effectuer un retrait"
                        + "\n (3).Effectuer un virement "
                        + "\n (4).Afficher les opérations "
                        + "\n  (5).Reteur au menu principale");
                Scanner scanner = new Scanner(System.in);
                sh = scanner.nextInt();
                switch (sh) {
                    case 1:
                        Operation.depot();//mthd depot
                        break;
                    case 2:
                        //mthd retrait
                        break;
                    case 3:
                        //mthd virement
                        break;
                    case 4:
                        //mthd affichage opr
                        break;
                    case 5:
                        System.out.println("Vous avez quitter ");
                        break;
                    default:
                        System.out.println("Merci d'entrer un choix valide ");
                        break;
                }
            }
        }
        public static void Filtrage () {
            int f = 0;
            while (f != 5) {
                System.out.println("\n -------Effectuer un Filtrage------- \n"
                        + "\n (1).Filtrer par type de transaction "
                        + "\n (2).Filtrer par solde minimum "
                        + "\n (3).Filtrer des operation par date  "
                        + "\n  (4).Reteur au menu principale");

                Scanner scanner = new Scanner(System.in);
                f = scanner.nextInt();
                switch (f) {
                    case 1:
                        //mthd typ de transaction
                        break;
                    case 2:
                        //mthd solde min
                        break;
                    case 3:
                        //mthd opr par date
                        break;
                    case 4:
                        System.out.println("Vous avez quitter ");
                        break;
                    default:
                        System.out.println("Merci d'entrer un choix valide");
                        break;
                }
            }
        }
    }