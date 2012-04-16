/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kokeilut;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Tietovarasto.YhteydenHallinta;

/**
 *
 * @author Vesihiisi
 */
public class HenkiloVarasto {
    private String ajuri="org.apache.derby.jdbc.EmbeddedDriver";
    private String url="jdbc:derby:testi";
    private String nimi="saku";
    private String salasana="salainen";
    private YhteydenHallinta yhteys=new YhteydenHallinta();
    
    public void lisaaHenkilo(Henkilo uusi){
        Connection yhteys=null;
        PreparedStatement lisayslause=null;
        try{
            yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, salasana, salasana);
            String lisays="insert into henkilo (henkiloID, etunimi,sukunimi, syntymavuosi) values(?,?,?,?)";
            lisayslause=yhteys.prepareStatement(lisays);
            lisayslause.setInt(1, uusi.getId());
            lisayslause.setString(2, uusi.getEtunimi());
            lisayslause.setString(3, uusi.getSukunimi());
            lisayslause.setInt(4, uusi.getVuosi());
            int lkm=lisayslause.executeUpdate();
            System.out.println("rivejä muuttui: "+lkm);
                
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            YhteydenHallinta.suljeYhteys(null);
            YhteydenHallinta.suljeLause(null);
        }
    }
    public List<Henkilo> haeKaikki(){
        List<Henkilo> henkilot=new ArrayList<Henkilo>();
        Connection yhteys=null;
        PreparedStatement hakulause=null;
        try{
            yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, salasana, salasana);
            String haku="select * from henkilo";
            hakulause=yhteys.prepareStatement(haku);
            ResultSet rs=hakulause.executeQuery();
            while(rs.next()){
                int id=rs.getInt(1);
                String etunimi=rs.getString(2);
                String sukunimi=rs.getString(3);
                int vuosi=rs.getInt(4);
                henkilot.add(new Henkilo(id, etunimi, sukunimi, vuosi));
                }
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            YhteydenHallinta.suljeYhteys(null);
            YhteydenHallinta.suljeLause(null);
        }
        return henkilot;
    }
    public void poistaHenkilo(int id){
        Connection yhteys=null;
        PreparedStatement poistolause=null;
        try{
            yhteys=YhteydenHallinta.avaaYhteys(ajuri, url, salasana, salasana);                
            String poista="delete from henkilo where henkiloID=?";
            poistolause=yhteys.prepareStatement(poista);
            poistolause.setInt(1, id);
            poistolause.executeUpdate();
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            YhteydenHallinta.suljeYhteys(null);
            YhteydenHallinta.suljeLause(null);
        }
    }
}
