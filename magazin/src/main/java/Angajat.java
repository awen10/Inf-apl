/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Angajat {

    private final String nume;
    private final boolean tip;//false=vanzator ; true=administrator;
    private final Stoc stoc;

    public Angajat(String nume, boolean tip, Stoc stoc) {
        this.nume = nume;
        this.tip = tip;
        this.stoc = stoc;
    }

    public void AdaugareInStoc(String nume, int cantitate) {
        if (this.tip == false) {
            System.out.print("Nu este Administrator");
        } else {
            stoc.AdaugareCantitate(nume, cantitate);
        }
    }

    public void AdaugareProdus(String nume, float pret, int cantitate) {
        if (this.tip == false) {
            System.out.print("Nu este Administrator");
        } else {
            stoc.AdaugareProdus(nume, pret, cantitate);
        }
    }

    public void Vanzare(String nume, int cantitate) {
        if (tip == true) {
            System.out.print("Nu este Vanzator");
        } else {
            stoc.ScadereCantitate(nume, cantitate);
        }
    }

    public String GetNume() {
        return this.nume;
    }
}
