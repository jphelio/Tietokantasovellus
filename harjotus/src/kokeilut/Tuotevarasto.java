package kokeilut;

import data.Tuote;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vesihiisi
 */
public class Tuotevarasto {
    private List<Tuote> tuotteet=new ArrayList<Tuote>();
    
    public void lisaaTuote(Tuote tuote){
        if(!tuotteet.contains(tuote)){
            tuotteet.add(tuote);
        }
    }
    
    public String teeHtml(){
        String taulukko="<table>";
        for(Tuote tuote: tuotteet){
            taulukko+="\n  <tr>";
            taulukko+="\n    <td>"+tuote.getNimi()+"</td>";
            taulukko+="\n    <td>"+tuote.getHinta()+"</td>";
            taulukko+="\n    <td>"+tuote.getKuvaus()+"</td>";
            taulukko+="\n    <td>"+tuote.getTuoteNro()+"</td>";
            taulukko+="\n  </tr>";
            
        }
        taulukko+="\n</table>";
        return taulukko;
    }
    
    public void teeTiedosto(){
        PrintWriter ulos=null;
        try {
            ulos= new PrintWriter(new FileWriter(new File("teksti.html")));
            ulos.println("<!DOCTYPE html>");
            ulos.println("<html>");
            ulos.println("<head>");
            ulos.println("<title>Tuotteet</title>");
            ulos.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            ulos.println("</head>");
            ulos.println("<body>");
            ulos.println(teeHtml());
            ulos.println("</body>");
            ulos.println("</html>");
        }
        catch(Exception fnfe){
            fnfe.printStackTrace();
        }
        finally { //finally osa tehdään joka tapauksessa
            if(ulos!=null) {
            ulos.close(); //PrintWriter ei aiheuta poikkeusta
            }
}
    }
    
    public static void main(String[] args) {
        Tuotevarasto varasto=new Tuotevarasto();
        varasto.lisaaTuote(new Tuote(1, "banaani", 200, "banaani"));
        varasto.lisaaTuote(new Tuote(2, "suklaa", 1000, "erikoissuklaa"));
        varasto.lisaaTuote(new Tuote(3, "lippu", 500, "matkamuisto"));
        varasto.teeTiedosto();
    }
}
