package fr.btsciel;

public class Bateau_A_Moteur extends Bateau {
    private int puissance;
    private int nombreDeMoteurs;

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
    public void setNombreDeMoteurs(int nombreDeMoteurs) {
        this.nombreDeMoteurs = nombreDeMoteurs;
    }
    public int getPuissance() {
        return puissance;
    }
    public int getNombreDeMoteurs() {
        return nombreDeMoteurs;
    }
    public Bateau_A_Moteur() {
    }
    public Bateau_A_Moteur(double lo, double la, String co, int pu, int mo) {
        super(lo, la, co);
        this.setPuissance(pu);
        this.setNombreDeMoteurs(mo);
    }
}