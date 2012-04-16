/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tietovarasto;

/**
 *Täällä on metodit jotka totetuteaan
 * @author Vesihiisi
 */
public class Tietovarasto {
    /**
     * palauttaa tuotteen annetulla tuoteNrolla
     * @param tuoteenNro
     * @return tuote
     */
    public Tuote haeTuote(int tuoteenNro);
    /**
     * palauttaa tuoetten nimen perusteella
     * @param nimi
     * @return tuote
     */
    public Tuote haeTuote(String nimi);
    /**
     * hakee kaikki tuotteet
     * @return palauttaa tuotteet listana(järjestely?S)
     */
    public List<Tuote> haeKaikkiTuotteet();
    
    /**
     * lisää tuotteen luetteloihin
     * @param lisättävä tuote
     */
    public void lisaaTuote(Tuote tuote);
    
    /**
     * poistaa tuotteen luetteloista
     * @param tuoteNro poistettavan tuotteen numero
     */
    public void poistaTuote(int tuoteNro);
    
    /**
     * hakee kaikki tuoteryhmat
     * @return tuoteryhmat listana(järjestely?)
     */
    public List<Tuoteryhma> haeKaikkiTuoteryhmat();
    
//    public List<Tuoteryhma> haeKaikkiTuoteryhmat(String nimi);
    /**
     * Hakee kaikki lennot
     * @return 
     */
    public List<Lento> haeKaikkiLennot();
}
