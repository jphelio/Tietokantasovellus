/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tietovarasto;

import java.sql.*;

/**
 *
 * @author Vesihiisi
 */
public class YhteydenHallinta {
    public static Connection avaaYhteys(String ajuri, String url, String kayttajatunnus, String salasana) throws SQLException, Exception{
        try{
            Class.forName(ajuri).newInstance();
            return DriverManager.getConnection(url, kayttajatunnus, salasana);
        }
        catch(SQLException e){
            throw new SQLException("ei toimi");
        }
    }
    public static boolean suljeYhteys(Connection yhteys){
        if(yhteys!=null){
            try{
                yhteys.close();
                return true;
            }
            catch(Exception e){
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static void suljeLause(Statement lause){
        if(lause!=null){
            try{
                lause.close();
            }
            catch(SQLException sqle){
                
            }
        }
    }
}
