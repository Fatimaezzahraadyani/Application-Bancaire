import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private String nom;
    private String prenom;
    private String addresse;
    private String email;
    private String Tele;
    private int Id;


    static Scanner sc = new Scanner(System.in);
    public Client (String nom,String prenom,String addresse,String email,int Id,String Tele) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.addresse = addresse;
        this.Tele = Tele;
        this.Id = Id;
    }

    public int getId(){
        return Id;
    }
    public void setId(){
        Id = Id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(){
        this.nom = nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(){
        this.prenom = prenom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return Tele;
    }

    public void setTele(String tele) {
        Tele = tele;
    }
    public static Client Ajouterclient(){
        System.out.println("veuillez entrer les infos du client");
        System.out.println("nom : " );
        String nom = sc.nextLine();
        System.out.println("prenom : ");
        String prenom = sc.nextLine();
        System.out.println("addresse : ");
        String addresse = sc.nextLine();
        System.out.println("email : ");
        String em = sc.nextLine();
        String email = Compte.validationInput(em,"^[\\w]+@[\\w]+\\.[A-Za-z]{2,}$");
        System.out.println("tele : ");
        String tele = Compte.validationInput(sc.nextLine(),"^[0-9]{10,}$");

        System.out.println("id : ");
        int id = sc.nextInt();
        sc.nextLine();

        return new Client(nom,prenom,addresse,email,id,tele);
    }
    public static void AfficherInfoClient(Client client){
        System.out.println("Nom du client : " + client.getNom());
        System.out.println("Prenom du client : " + client.getPrenom());
        System.out.println("Addresse du client : " + client.getAddresse());
        System.out.println("email du client : " + client.getEmail());
        System.out.println("Tele du client : " + client.getTele());
        System.out.println("Id du client : "+ client.getId());

    }
    public static  Client proprietaire() {
        System.out.println("veullier saisir l'id du propriétaire ");
        int d = sc.nextInt();
        for (Client client : Main.clients) {
            if (client.getId() == d) {
                return client;
            } else {
                System.out.println("Client introuvable !!");
            }
        }
    return null;
    }
    @Override
        public String toString () {
            return "Compte{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", addresse='" + addresse + '\'' +
                    ", email='" + email + '\'' +
                    ", Tele=" + Tele +
                    ", Id=" + Id +
                    '}';
        }
    }
