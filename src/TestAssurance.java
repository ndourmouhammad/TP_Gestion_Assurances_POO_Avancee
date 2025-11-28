public class TestAssurance {

    public static void main(String[] args) {

        // Création des contrats
        Assurance a1 = new AssuranceAuto("Aliou Ndiaye", 50000, "DK-1234", 6, 50);
        Assurance a2 = new AssuranceAuto("Fatou Diop", 50000, "DK-5678", 10, 150);
        Assurance a3 = new AssuranceHabitation("Mamadou Fall", 30000, "Rue 12 Dakar", 100, false);
        Assurance a4 = new AssuranceHabitation("Awa Kane", 30000, "Rue 45 Pikine", 150, true);
        Assurance a5 = new AssuranceVie("Cheikh Ba", 20000, 30, 10000000, "Mariama Ba");
        Assurance a6 = new AssuranceSante("Khady Sow", 10000, "Confort", 2);

        // Tableau polymorphe contenant tous les contrats
        Assurance[] assurances = {a1, a2, a3, a4, a5, a6};

        // Création du gestionnaire
        GestionnaireAssurance gestionnaire = new GestionnaireAssurance();

        // Affichage individuel
        System.out.println("=== Affichage individuel ===");
        gestionnaire.afficherInfos(a1);
        gestionnaire.afficherInfos(a6);

        // Affichage global
        System.out.println("\n=== Affichage global ===");
        gestionnaire.afficherInfos(assurances);

        // Affichage filtré (Habitation)
        System.out.println("\n=== Affichage filtré (Habitation) ===");
        gestionnaire.afficherInfos(assurances, "Habitation");

        // Calcul des primes (démonstration du polymorphisme)
        System.out.println("\n=== Calcul des primes ===");
        for (Assurance a : assurances) {
            System.out.println(a.getTypeAssurance() + " - Prime : " + a.calculerPrime() + " FCFA");
        }

        // Nombre total de contrats
        System.out.println("\nNombre total de contrats : " + Assurance.getNombreContrats());

        // Calcul du chiffre d’affaires total
        double chiffreAffaires = gestionnaire.calculerChiffreAffaires(assurances);
        System.out.println("\nChiffre d’affaires total : " + chiffreAffaires + " FCFA");

        // Assurance la moins chère
        Assurance moinsChere = gestionnaire.trouverMoinsChere(assurances);
        System.out.println("\nAssurance la moins chère : " + moinsChere
                + " → Prime : " + moinsChere.calculerPrime() + " FCFA");

        // Surcharge du calcul de coût total avec réduction
        System.out.println("\n=== Calcul du coût total avec réduction ===");
        double coutNormal = a1.calculerCoutTotal(5);
        double coutAvecReduction = a1.calculerCoutTotal(5, 0.1);
        System.out.println("Coût normal sur 5 ans : " + coutNormal + " FCFA");
        System.out.println("Coût avec réduction (10%) : " + coutAvecReduction + " FCFA");

        // Prime moyenne
        System.out.println("\n=== Prime moyenne des assurances ===");
        double primeMoyenne = Assurance.calculerPrimeMoyenne(assurances);
        System.out.println("Prime moyenne : " + primeMoyenne + " FCFA");
    }
}
