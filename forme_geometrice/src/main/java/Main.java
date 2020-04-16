
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Meniu meniu=new Meniu();
       // meniu.meniu();
        Plansa plansa = new Plansa();
        plansa.Adaugare(0,0 , 0, 0, "Cerc");
        Scanner f = new Scanner(System.in);
        int i = -1;
        int j = -1;
        int x1;
        int y1;
        int x2;
        int y2;
        int index;

        while (i != 0) {
            System.out.println("0.Iesire");
            System.out.println("1.Adaugare");
            System.out.println("2.Stergere");
            System.out.println("3.Modificare");
            System.out.println("4.Vizualizare plansa");
            i = f.nextInt();
            switch (i) {
                case 0:
                    break;
                case 1:
                    while (j != 0) {
                        System.out.println("0.Inapoi");
                        System.out.println("1.Cerc");
                        System.out.println("2.Patrat");
                        j = f.nextInt();
                        switch (j) {
                            case 0 ->  {
                                break;
                    }
                            case 1 ->  {
                                x1 = f.nextInt();
                                y1 = f.nextInt();
                                x2 = f.nextInt();
                                y2 = f.nextInt();
                                plansa.Adaugare(x1, y1, x2, y2, "Cerc");
                                break;
                    }
                            case 2 ->  {
                                x1 = f.nextInt();
                                y1 = f.nextInt();
                                x2 = f.nextInt();
                                y2 = f.nextInt();
                                plansa.Adaugare(x1, y1, x2, y2, "Patrat");
                                break;
                    }
                        }
                    }
                case 2:
                    index = f.nextInt();
                    plansa.Stergere(index);
                    break;
                case 3:
                    index = f.nextInt();
                    plansa.Modificare(index);
                    break;
                case 4:
                    plansa.Afisare();
                    break;
            }
        }
    }

}
