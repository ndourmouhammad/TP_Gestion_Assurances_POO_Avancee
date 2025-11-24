public abstract class Assurance {

    private String numeroContrat;
    private String nomClient;
    private double montantCotisation;

    static int compteurContrats = 0;

    public Assurance(String nomClient, double montantCotisation) {
        compteurContrats++;
        this.numeroContrat = String.format("ASS%04d", compteurContrats);
        this.setNomClient(nomClient);
        this.setMontantCotisation(montantCotisation);
    }

    // Getters et Setters
    public String getNumeroContat() {
        return numeroContrat;
    }

    public void setNumeroContat(String numeroContat) {
        this.numeroContrat = numeroContat;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getMontantCotisation() {
        return montantCotisation;
    }

    public void setMontantCotisation(double montantCotisation) {
        this.montantCotisation = montantCotisation;
    }

    // methode abstaites
    public abstract double calculerPrime();
    public abstract String getTypeAssurance();

    // methode concrete
    public double calculerCoutTotal(int nbAnnees){
        return montantCotisation * 12 * nbAnnees;
    }


    @Override
    public String toString() {
        return "Contrat: " + numeroContrat +
                " | Client: " + nomClient +
                " | Cotisation mensuelle: " + montantCotisation + "FCFA";
    }

    // methode statique
    public static int getNombreContrats() {
        return compteurContrats;
    }


    public double calculerCoutTotal(int nbAnnees, double tauxReduction) {
        double coutTotal = calculerPrime() * nbAnnees;
        double reduction = coutTotal * tauxReduction;
        return coutTotal - reduction;
    }

    public static double calculerPrimeMoyenne(Assurance[] assurances) {
        if (assurances == null || assurances.length == 0) {
            return 0;
        }
        double total = 0;
        for (Assurance a : assurances) {
            total += a.calculerPrime();
        }
        return total / assurances.length;
    }

}
