public class AssuranceAuto extends Assurance{

    // Attributs
    private String immatriculation;
    private int puissanceFiscale;
    private int bonusMalus;

    // Constructeur
    public AssuranceAuto(String nomClient, double montantCotisation, String immatriculation, int puissanceFiscale, int bonusMalus) {
        super(nomClient, montantCotisation);
        this.setImmatriculation(immatriculation);
        this.setPuissanceFiscale(puissanceFiscale);
        this.setBonusMalus(bonusMalus);
    }

    // Getters et Setters
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getPuissanceFiscale() {
        return puissanceFiscale;
    }

    public void setPuissanceFiscale(int puissanceFiscale) {
        this.puissanceFiscale = puissanceFiscale;
    }

    public int getBonusMalus() {
        return bonusMalus;
    }

    public void setBonusMalus(int bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    // Redefinie des methodes calculerPrime et getTypeAssurance
    @Override
    public double calculerPrime() {
        return getMontantCotisation() * 12 * (1 + puissanceFiscale * 0.05) * (bonusMalus / 100.0);
    }

    @Override
    public String getTypeAssurance() {
        return "Auto";
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Immatriculation: " + immatriculation +
                " | Puissance fiscale: " + puissanceFiscale +
                " | Bonus/Malus: " + bonusMalus + "%";
    }
}
