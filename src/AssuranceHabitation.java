public class AssuranceHabitation extends Assurance{

    private String adresse;
    private double superficie;
    private  boolean zoneRisque;

    public AssuranceHabitation(String nomClient, double montantCotisation, String adresse, double superficie, boolean zoneRisque) {
        super(nomClient, montantCotisation);
        this.setAdresse(adresse);
        this.setSuperficie(superficie);
        this.setZoneRisque(zoneRisque);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isZoneRisque() {
        return zoneRisque;
    }

    public void setZoneRisque(boolean zoneRisque) {
        this.zoneRisque = zoneRisque;
    }

    // Redefinie la methode calculerPrime et getTypeAssurance
    @Override
    public double calculerPrime() {
        double coefficientRisque = zoneRisque ? 1.3 : 1.0;
        return getMontantCotisation() * 12 * (1 + superficie / 1000.0) * coefficientRisque;
    }

    @Override
    public String getTypeAssurance() {
        return "Assurance Habitation";
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Adresse: " + adresse +
                " | Superficie: " + superficie + " m²" +
                " | Zone à risque: " + (zoneRisque ? "Oui" : "Non");
    }
}
