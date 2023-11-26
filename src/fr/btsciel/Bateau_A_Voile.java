package fr.btsciel;
public class Bateau_A_Voile extends Bateau {
    private int voiles;
    private int mats;

    public void setVoiles(int voiles) {
        this.voiles = voiles;
    }
    public void setMats(int mats) {
        this.mats = mats;
    }
    public int getVoiles() {
        return voiles;
    }
    public int getMats() {
        return mats;
    }
    public Bateau_A_Voile() {
    }
    public Bateau_A_Voile(double lo, double la, String co, int vo, int ma) {
        super(lo, la, co);
        this.setMats(ma);
        this.setVoiles(vo);
    }
}