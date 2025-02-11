package poo2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Voiture voiture = new Voiture();
        
        System.out.print("entrer la marque de voiture : ");
        String couleur = scanner.nextLine();
        boolean found = false;
     
        for(String color : Voiture.couleurAutorized){
            if(color.equals(couleur)){
              Voiture.couleur = color;
              found = true;
              break;
            }
        }
        
        voiture.marque;
        voiture.modele;
       
        scanner.close();

        voiture.demarrer();
    }
}