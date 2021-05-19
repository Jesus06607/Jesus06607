/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author under305
 */
public class Controller {
    private static Conexion conn = new Conexion();
    private static Connection conection = (Connection) conn.conexion();
    
    
    public static boolean addData(String table, String campos, String valores){
        String sql = "INSERT INTO "+table+" ("+campos+") values ("+valores+")";
        try{
            Statement st1 = (Statement) conection.createStatement();
            int rs1 = st1.executeUpdate(sql);
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
