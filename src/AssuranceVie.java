public class AssuranceVie extends Assurance{

    private int ageAssure;
    private double capitalGaranti;
    private String benificiaire;

    public AssuranceVie(String nomClient, double montantCotisation, int ageAssure, double capitalGaranti, String benificiaire) {
        super(nomClient, montantCotisation);
        this.setAgeAssure(ageAssure);
        this.setCapitalGaranti(capitalGaranti);
        this.setBenificiaire(benificiaire);
    }

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

    @Override
    public double calculerPrime() {
//        Formule :
//        Prime = cotisationBase × (1 + age/100) × (capitalGaranti/100000)
        return getMontantCotisation() * 12 * (1 + getAgeAssure() / 100.0) * (getCapitalGaranti() / 100000.0);
    }

    @Override
    public String getTypeAssurance() {
        return "Assurance Vie";
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Age: " + ageAssure +
                " | Capital garanti: " + capitalGaranti + " FCFA" +
                " | Benificiaire: " + benificiaire;
    }
}
