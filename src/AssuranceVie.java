public class AssuranceVie extends Assurance{

    // Attributs
    private int ageAssure;
    private double capitalGaranti;
    private String benificiaire;

    // Constructeur
    public AssuranceVie(String nomClient, double montantCotisation, int ageAssure, double capitalGaranti, String benificiaire) {
        super(nomClient, montantCotisation);
        this.setAgeAssure(ageAssure);
        this.setCapitalGaranti(capitalGaranti);
        this.setBenificiaire(benificiaire);
    }

    // Getters et Setters
    public int getAgeAssure() {
        return ageAssure;
    }

    public void setAgeAssure(int ageAssure) {
        this.ageAssure = ageAssure;
    }

    public double getCapitalGaranti() {
        return capitalGaranti;
    }

    public void setCapitalGaranti(double capitalGaranti) {
        this.capitalGaranti = capitalGaranti;
    }

    public String getBenificiaire() {
        return benificiaire;
    }

    public void setBenificiaire(String benificiaire) {
        this.benificiaire = benificiaire;
    }

    // Redefinie les methodes calculerPrime et getTypeAssurance
    @Override
    public double calculerPrime() {
        return getMontantCotisation() * 12 * (1 + getAgeAssure() / 100.0) * (getCapitalGaranti() / 100000.0);
    }

    @Override
    public String getTypeAssurance() {
        return "Vie";
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Age: " + ageAssure +
                " | Capital garanti: " + capitalGaranti + " FCFA" +
                " | Benificiaire: " + benificiaire;
    }
}
