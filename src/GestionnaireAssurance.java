public class GestionnaireAssurance {

    // V1. Afficher une seule assurance avec sa prime
    public void afficherInfos(Assurance a) {
        System.out.println(a.toString());
        System.out.println("Prime annuelle : " + a.calculerPrime() + " FCFA");
    }

    // V2. Afficher toules les assurances d'un tableau
    public void afficherInfos(Assurance[] assurances) {
        for (Assurance a : assurances) {
            afficherInfos(a);
        }
    }

    // V3. Afficher uniquement les assurances du type specifie
    public void afficherInfos(Assurance[] assurances, String typeFiltre) {
        for (Assurance a : assurances) {
            if (a.getTypeAssurance().equalsIgnoreCase(typeFiltre)) {
                afficherInfos(a);
            }
        }
    }

    // Calculer le total des primes annuelles
    public double calculerChiffreAffaires(Assurance[] assurances) {
        double total = 0;
        for (Assurance a : assurances) {
            total += a.calculerPrime();
        }
        return total;
    }

    // Trouver l'assurance la moins chere
    public Assurance trouverMoinsChere(Assurance[] assurances) {

        if (assurances == null || assurances.length == 0) {
            return null;
        }
        Assurance moinsChere = assurances[0];
        for (Assurance a : assurances) {
            if (a.calculerPrime() < moinsChere.calculerPrime()) {
                moinsChere = a;
            }
        }

        return moinsChere;
    }
}
