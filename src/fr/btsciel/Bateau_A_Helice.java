package fr.btsciel;

public class Bateau_A_Helice extends Bateau_A_Moteur {
    private double tirant_D_Eau;
    public void setTirant_D_Eau(double tirant_D_Eau) {
        this.tirant_D_Eau = tirant_D_Eau;
    }
    public double getTirant_D_Eau() {
        return tirant_D_Eau;
    }
    public Bateau_A_Helice() {
    }
    public Bateau_A_Helice(double lo, double la, String co, int pu, int mo, double tideau) {
        super(lo, la, co, pu, mo);
        this.setTirant_D_Eau(tideau);
    }
}