
public class Cerc implements Forme {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String tip;

    public Cerc(int x, int y, int x2, int y2, String tip) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.tip = tip;
    }

    @Override
    public void Adaugare(int x1, int y1, int x2, int y2, String tip) {
        System.out.println("S-a creat un cerc");
    }

    @Override
    public void Stergere(int i) {
        System.out.println("S-a sters un cerc");
    }

    @Override
    public void Modificare(int i) {
        System.out.println("S-a modificat un cerc");
    }

    @Override
    public String GetTip() {
        return this.tip;
    }

    @Override
    public void SetTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void Afisare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
