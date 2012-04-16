/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kokeilut;
import java.util.Scanner;

public class Harjotus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            HenkiloVarasto varasto=new HenkiloVarasto();
            
            Scanner nappis=new Scanner(System.in);
            for(Henkilo henkilo:varasto.haeKaikki()){
                System.out.println(henkilo);
            }
            System.out.print("anna id: ");
            int id=nappis.nextInt();
            System.out.print("anna etunimi: ");
            String etunimi=nappis.next();
            System.out.print("anna sukunimi: ");
            String sukunimi=nappis.next();
            System.out.print("anna vuosi: ");
            int vuosi=nappis.nextInt();
            
            varasto.lisaaHenkilo(new Henkilo(id, etunimi, sukunimi, vuosi));
            System.out.println("######################");
            for(Henkilo henkilo:varasto.haeKaikki()){
                System.out.println(henkilo);
            }
            System.out.print("anna poistettava id: ");
            id=nappis.nextInt();
            varasto.poistaHenkilo(id);
            System.out.println("######################");
            for(Henkilo henkilo:varasto.haeKaikki()){
                System.out.println(henkilo);
            }
    }
}
