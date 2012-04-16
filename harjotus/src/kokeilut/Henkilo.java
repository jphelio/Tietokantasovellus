/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kokeilut;

/**
 *
 * @author Vesihiisi
 */
public class Henkilo {
    private int id;
    private String etunimi;
    private String sukunimi;
    private int vuosi;

    public Henkilo(int id, String etunimi, String sukunimi, int vuosi) {
        this.id = id;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.vuosi = vuosi;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public int getId() {
        return id;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public int getVuosi() {
        return vuosi;
    }

    @Override
    public String toString() {
        return "Henkilo{" + "id=" + id + ", etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", vuosi=" + vuosi + '}';
    }
    
}
