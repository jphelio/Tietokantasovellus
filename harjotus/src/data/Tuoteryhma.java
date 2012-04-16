/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Vesihiisi
 */
public class Tuoteryhma {
    private int tuoteryhmanNro;
    private String tuoteryhmanNimi;

    public Tuoteryhma(int tuoteryhmanNro, String tuoteryhmanNimi) {
        this.tuoteryhmanNro = tuoteryhmanNro;
        this.tuoteryhmanNimi = tuoteryhmanNimi;
    }

    public String getTuoteryhmanNimi() {
        return tuoteryhmanNimi;
    }

    public int getTuoteryhmanNro() {
        return tuoteryhmanNro;
    }

    @Override
    public String toString() {
        return "Tuoteryhma{" + "tuoteryhmanNro=" + tuoteryhmanNro + ", tuoteryhmanNimi=" + tuoteryhmanNimi + '}';
    }
    
}
