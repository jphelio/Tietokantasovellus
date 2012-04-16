/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Vesihiisi
 */
public class AsiakaanLento {
    private int asiakasNro;
    private int paikka;
    private int lennonNro;

    public AsiakaanLento(int asiakasNro, int paikka, int lennonNro) {
        this.asiakasNro = asiakasNro;
        this.paikka = paikka;
        this.lennonNro = lennonNro;
    }

    public int getAsiakasNro() {
        return asiakasNro;
    }

    public int getLennonNro() {
        return lennonNro;
    }

    public int getPaikka() {
        return paikka;
    }

    @Override
    public String toString() {
        return "Asiakas{" + "asiakasNro=" + asiakasNro + ", paikka=" + paikka + ", lennonNro=" + lennonNro + '}';
    }
    
}
