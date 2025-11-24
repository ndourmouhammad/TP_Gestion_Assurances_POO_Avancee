public class GestionnaireAssurance {

    public void afficherInfos(Assurance a) {
        System.out.println(a.toString());
        System.out.println("Prime annuelle : " + a.calculerPrime() + " FCFA");
    }

    public void afficherInfos(Assurance[] assurances) {
        for (Assurance a : assurances) {
            afficherInfos(a);
        }
    }

    public void afficherInfos(Assurance[] assurances, String typeFiltre) {
        for (Assurance a : assurances) {
            if (a.getTypeAssurance().equalsIgnoreCase(typeFiltre)) {
                afficherInfos(a);
            }
        }
    }

    public double calculerChiffreAffaires(Assurance[] assurances) {
        double total = 0;
        for (Assurance a : assurances) {
            total += a.calculerPrime();
        }
        return total;
    }
}
