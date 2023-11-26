package fr.btsciel;
public class Bateau {
    private double longueur;
    private double largeur;
    private String coque;

    public double getLongueur() {
        return longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public String getCoque() {
        return coque;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public void setCoque(String coque) {
        this.coque = coque;
    }
    public Bateau() {
    }
    public Bateau(double lo, double la, String co) {
        this.setLongueur(lo);
        this.setLargeur(la);
        this.setCoque(co);
    }
}