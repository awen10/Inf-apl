/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Produs {

    private String nume;
    private float pret;
    private int cantitate;

    public Produs(String nume, float pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String GetNume() {
        return this.nume;
    }

    public float GetPret() {
        return this.pret;
    }

    public int GetCantitate() {
        return this.cantitate;
    }

    public void AdaugareCantitate(int cantitate) {
        this.cantitate += cantitate;
    }

    public void ScadereCantitate(int cantitate) {
        this.cantitate -= cantitate;
    }

    public void SetCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
