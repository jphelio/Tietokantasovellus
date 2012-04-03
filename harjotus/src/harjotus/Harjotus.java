/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package harjotus;
import java.sql.*;

public class Harjotus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            Connection yhteys=DriverManager.getConnection("jdbc:derby:testi", "saku", "salainen");
            String haku="select * from henkilo";
            PreparedStatement hakulause=yhteys.prepareStatement(haku);
            ResultSet rs=hakulause.executeQuery();
            while(rs.next()){
                int id=rs.getInt(1);
                String etunimi=rs.getString(2);
                String sukunimi=rs.getString(3);
                int vuosi=rs.getInt(4);
                Henkilo apu = new Henkilo(id, etunimi, sukunimi, vuosi);
                System.out.println(apu);
                
            }
            yhteys.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
