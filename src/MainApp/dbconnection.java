/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;
import java.sql.*;
/**
 *
 * @author hi
 */
public class dbconnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ems_db","root",""); //database name
        } catch (Exception ex) {
            System.out.println (ex.getMessage());
        }
        return con;
    }
}
