/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbAccess;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author D005TU
 */
public class DBUtils {

    static String user, pass, DB, IP;
    static DBUtils dbu = new DBUtils();

    //    connection string to connect on server
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            dbu.readProperties();
        } catch (IOException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        }

        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://" + IP + "/" + DB;
        Connection con = DriverManager.getConnection(url, user, pass);

        return con;
    }

    public void readProperties() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader()
                .getResourceAsStream("resource/db.properties");
        Properties properties = new Properties();
        //load the inputStream using the Properties
        properties.load(inputStream);
        //get the value of the property
        DB = properties.getProperty("dbName");
        user = properties.getProperty("dbUserName");
        pass = properties.getProperty("dbPassword");
        IP = properties.getProperty("dbIP");
        
        
        System.out.println("db ;" +DB);
        System.out.println("db ;" +user);
        System.out.println("db ;" +pass);
        System.out.println("db ;" +IP);
 
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getConnection();
    }

}




        