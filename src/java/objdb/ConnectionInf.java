/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objdb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author eploentham
 */
public class ConnectionInf {
    
    public Connection getConnection() throws Exception {
        String url = "", host_address="localhost:3306", user_db="root", pass_db="Ekartc2c5", datebase="Northernaviation";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            url = "jdbc:mysql://" + host_address + "/" + datebase;
            Connection con = DriverManager.getConnection(url, user_db, pass_db);
            //con = ds.getConnection();
            System.out.println(" Database connection established to " + url+ ".");

            return con;
        } catch (java.sql.SQLException e) {
            System.out.println(" Connection couldn't be established to "+ url);
            throw (e);
        }
    }
}
