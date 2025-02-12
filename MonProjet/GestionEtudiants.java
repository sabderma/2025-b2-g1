package MonProjet;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionEtudiants {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    public void ajouterEtudiant(String nom, String prenom, String classe) {
        etudiants.add(new Etudiant(nom, prenom, classe));
    }

    public void afficherEtudiants() {
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            for (Etudiant e : etudiants) {
                System.out.println(e);
            }
        }
    }

    public void supprimerEtudiant(String nom) {
        Iterator<Etudiant> iterator = etudiants.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNom().equalsIgnoreCase(nom)) {
                iterator.remove();
                System.out.println("Étudiant supprimé.");
                return;
            }
        }
        System.out.println("Aucun étudiant trouvé avec ce nom.");
    }
}
