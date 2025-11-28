public class AssuranceSante extends Assurance {

    // Attributs
    private String typeFormule;
    private int nbBeneficiaires;

    // Constructeurs
    public AssuranceSante(String nomClient, double montantCotisation, String typeFormule, int nbBeneficiaires) {
        super(nomClient, montantCotisation);
        this.setTypeFormule(typeFormule);
        this.setNbBenificiaires(nbBeneficiaires);
    }

    // Getters et Setters
    public String getTypeFormule() {
        return typeFormule;
    }

    public void setTypeFormule(String typeFormule) {
        this.typeFormule = typeFormule;
    }

    public int getNbBenificiaires() {
        return nbBeneficiaires;
    }

    public void setNbBenificiaires(int nbBeneficiaires) {
        this.nbBeneficiaires = nbBeneficiaires;
    }

    // Redefinie des methodes calculerPrime et getTypeAssurance
    @Override
    public double calculerPrime() {
        double primeBase = getMontantCotisation();
        double coutFormule = 0;

        switch (typeFormule) {
            case "Basique":
                coutFormule = 10000;
                break;
            case "Confort":
                coutFormule = 20000;
                break;
            case "Premium":
                coutFormule = 30000;
                break;
            default:
                coutFormule = 5000;
        }
        double coutBeneficiaires = nbBeneficiaires * 5000;
        return primeBase + coutFormule + coutBeneficiaires;
    }

    @Override
    public String getTypeAssurance() {
        return "Sante";
    }
}
