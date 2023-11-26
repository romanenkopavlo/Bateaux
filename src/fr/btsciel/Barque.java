package fr.btsciel;
public class Barque extends Bateau {
    private int rame;
    public int getRame() {
        return rame;
    }
    public void setRame(int rame) {
        this.rame = rame;
    }
    public Barque() {
    }
    public Barque(double lo, double la, String co, int ra) {
        super(lo, la, co);
        this.setRame(ra);
    }
}