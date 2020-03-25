
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
public class Stoc {

    private Produs produs;
    private List<Produs> listaproduse;

    public Stoc() {
        listaproduse = new ArrayList<Produs>();
    }

    public void AdaugareProdus(String nume, float pret, int cantitate) {
        listaproduse.add(new Produs(nume, pret, cantitate));
        //System.out.println(listaproduse);
        // for(int i=0;i<listaproduse.size();i++){
        //System.out.println(listaproduse.get(i).GetNume());
        //}
    }

    public void AfisareStoc() {
        System.out.println("Produse aflate in stoc:");
        System.out.println("Produs" + " " + "Pret total" + " " + "Cantitate");
        for (int i = 0; i < listaproduse.size(); i++) {
            System.out.print(listaproduse.get(i).GetNume() + " ");
            System.out.print(listaproduse.get(i).GetPret() + " ");
            System.out.println(listaproduse.get(i).GetCantitate());

        }

    }

    public void AdaugareCantitate(String nume, int cantitate) {
        for (int i = 0; i < listaproduse.size(); i++) {
            if (listaproduse.get(i).GetNume() == nume) {
                listaproduse.get(i).SetCantitate(listaproduse.get(i).GetCantitate() + cantitate);
            }
        }
    }

    public void ScadereCantitate(String nume, int cantitate) {
        for (int i = 0; i < listaproduse.size(); i++) {
            if (listaproduse.get(i).GetNume() == nume) {
                if ((listaproduse.get(i).GetCantitate() - cantitate - cantitate) < 0) {
                    System.out.println("Cantitatea ceruta este prea mare");
                } else {
                    listaproduse.get(i).SetCantitate(listaproduse.get(i).GetCantitate() - cantitate);
                }
            }
        }
    }
}
