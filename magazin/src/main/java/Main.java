
import java.util.ArrayList;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adrian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stoc stoc = new Stoc();
        Angajat vanzator = new Angajat("Ana", false, stoc);
        Angajat admin = new Angajat("George", true, stoc);
        CasaDeMarcat casa = new CasaDeMarcat(vanzator);
        admin.AdaugareProdus("paine", (float) 1.0, 20);
        admin.AdaugareProdus("ulei", (float) 4.5, 10);
        admin.AdaugareProdus("faina", (float) 2.5, 15);
        admin.AdaugareProdus("oua", (float) 0.5, 40);
        stoc.AfisareStoc();
        admin.AdaugareInStoc("paine", 4);
        admin.AdaugareInStoc("paine", 10);
        stoc.AfisareStoc();
        casa.AdaugareBon("ulei", (float) 4.5, 2);
        casa.AdaugareBon("oua", (float) 0.5, 7);
        casa.GenerareBon();
        stoc.AfisareStoc();
        casa.AdaugareBon("paine", (float) 1.0, 1);
        casa.AdaugareBon("oua", (float) 0.5, 3);
        casa.AdaugareBon("ulei", (float) 4.5, 4);
        casa.GenerareBon();
        stoc.AfisareStoc();
    }

}
