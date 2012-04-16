/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;


/**
 *
 * @author Vesihiisi
 */
public class Ostoskori {
    private List<Tuote> tuoteet=new ArrayList<Tuote>();
    private AsiakaanLento asiakas;

    public Ostoskori(AsiakaanLento asiakas) {
        this.asiakas = asiakas;
    }

    public AsiakaanLento getAsiakas() {
        return asiakas;
    }

    public List<Tuote> getTuoteet() {
        return tuoteet;
    }

    @Override
    public String toString() {
        return "Ostoskori{" + "tuoteet=" + tuoteet + ", asiakas=" + asiakas + '}';
    }
    
    
}
