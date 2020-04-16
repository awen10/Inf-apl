
public interface Forme {

    void Adaugare(int x1, int y1, int x2, int y2, String tip);

    void Stergere(int i);

    void Modificare(int i);

    String GetTip();

    void SetTip(String tip);

    void Afisare();
}
