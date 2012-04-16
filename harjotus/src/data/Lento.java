/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Vesihiisi
 */
public class Lento {
    private int lennonNro;
    private String date;

    public Lento(int lennonNro, String date) {
        this.lennonNro = lennonNro;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public int getLennonNro() {
        return lennonNro;
    }

    @Override
    public String toString() {
        return "Lento{" + "lennonNro=" + lennonNro + ", date=" + date + '}';
    }
    
}
