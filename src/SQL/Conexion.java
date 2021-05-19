/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author under305
 */
public class Conexion {
    private Connection conect = null;
     
    public Connection conexion(){
        try{//se intenta la conexión
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/lockers_system", "root", "");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conect;//REGRESAR LA CONEXIÓN CUANDO ÉSTA SEA ESTABLE
    }
}
