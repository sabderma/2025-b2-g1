package poo;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        
        voiture.couleur = "Rouge";
        voiture.marque = "Toyota";
        voiture.modele = "corolla";

        voiture.demarrer();
    }
    
}
