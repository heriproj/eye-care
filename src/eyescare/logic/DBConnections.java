/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eyescare.logic;

import java.sql.*;
/**
 *
 * @author Rizal Asrul Pambudi
 */
public class DBConnections {
    private static Connection con;
    
    public static Connection getCon(){
        if(con == null){
            try{
                String url = "jdbc:mysql://localhost:3306/";
                String dbName = "project_oop";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url+dbName, user, pass);
            }catch(SQLException e){
                System.out.println("Error in making connection");
            }
        }
        return con;
    }
}
