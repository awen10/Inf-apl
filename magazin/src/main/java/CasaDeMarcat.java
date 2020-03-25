
import java.util.ArrayList;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adria
 */
public class CasaDeMarcat {
    // private String numevanzator;

    private Angajat vanzator;
    private List<Produs> listaprodusevandute;

    public CasaDeMarcat() {
        listaprodusevandute = new ArrayList<Produs>();
    }

    public CasaDeMarcat(Angajat vanzator) {
        listaprodusevandute = new ArrayList<Produs>();
        this.vanzator = vanzator;
    }

    public void AdaugareBon(String numeprodus, float pret, int cantitate) {
        listaprodusevandute.add(new Produs(numeprodus, (pret * cantitate), cantitate));
        vanzator.Vanzare(numeprodus, cantitate);
    }

    public void GenerareBon() {
        System.out.print("Vanzatorul este:" + " ");
        System.out.println(vanzator.GetNume());
        System.out.println("Produs" + " " + "Pret total" + " " + "Cantitate");
        for (int i = 0; i < listaprodusevandute.size(); i++) {
            System.out.print(listaprodusevandute.get(i).GetNume() + " ");
            System.out.print(listaprodusevandute.get(i).GetPret() + " ");
            System.out.println(listaprodusevandute.get(i).GetCantitate());

        }
    }
}
