
import java.util.ArrayList;
import java.util.*;

public class Plansa implements Forme {

    public List<Forme> plansa;

    public Plansa() {
        plansa = new ArrayList<Forme>();
    }

    @Override
    public void Adaugare(int x1, int y1, int x2, int y2, String tip) {
        if (tip.equals("Cerc")) {
            plansa.add(new Cerc(x1, y1, x2, y2, tip));
        } else if (tip.equals("Patrat")) {
            plansa.add(new Patrat(x1, y1, x2, y2, tip));
        }
    }

    @Override
    public void Stergere(int i) {
        plansa.remove(i);
    }

    @Override
    public void Modificare(int i) {
        if (plansa.get(i).GetTip().equals("Cerc")) {
            plansa.get(i).SetTip("Patrat");
        } else if (plansa.get(i).GetTip().equals("Patrat")) {
            plansa.get(i).SetTip("Cerc");
        }
    }

    @Override
    public String GetTip() {
        return "0";
    }

    @Override
    public void SetTip(String tip) {

    }

    @Override
    public void Afisare() {
        for (int l = 0; l < plansa.size(); l++) {
                        System.out.println(plansa.get(l).GetTip());
                    }
    }
    

}
