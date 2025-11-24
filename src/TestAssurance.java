public class TestAssurance {

    public static void main(String[] args) {

        Assurance a1 = new AssuranceAuto("Aliou Ndiaye", 50000, "DK-1234", 6, 50);
        Assurance a2 = new AssuranceAuto("Fatou Diop", 50000, "DK-5678", 10, 150);
        Assurance a3 = new AssuranceHabitation("Mamadou Fall", 30000, "Rue 12 Dakar", 100, false);
        Assurance a4 = new AssuranceHabitation("Awa Kane", 30000, "Rue 45 Pikine", 150, true);
        Assurance a5 = new AssuranceVie("Cheikh Ba", 20000, 30, 10000000, "Mariama Ba");

        Assurance[] assurances = {a1, a2, a3, a4, a5};

        // Création du gestionnaire
        GestionnaireAssurance gestionnaire = new GestionnaireAssurance();

//        System.out.println("=== Affichage individuel ===");
//        gestionnaire.afficherInfos(a1);
//        gestionnaire.afficherInfos(a2);
//
//        System.out.println("=== Affichage global ===");
//        gestionnaire.afficherInfos(assurances);

//        System.out.println("=== Affichage filtré (Habitation) ===");
//        gestionnaire.afficherInfos(assurances, "Habitation");

//        System.out.println("=== Calcul des primes ===");
//        for (Assurance a : assurances) {
//            System.out.println(a.getTypeAssurance() + " - Prime : " + a.calculerPrime() + " FCFA");
//        }

//        System.out.println("Nombre total de contrats : " + Assurance.getNombreContrats());

        double chiffreAffaires = gestionnaire.calculerChiffreAffaires(assurances);
        System.out.println("Chiffre d’affaires total : " + chiffreAffaires + " FCFA");
    }
}
