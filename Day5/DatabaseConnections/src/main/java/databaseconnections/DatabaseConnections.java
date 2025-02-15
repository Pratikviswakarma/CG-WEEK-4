package databaseconnections;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnections {
    public static Connection conn;
    //Make connection
    public static void connect(){
        try{
           conn= DriverManager.getConnection("demo","demo","demo");
            System.out.println("Connection opened");
        }catch (SQLException ex){
            System.out.println("Exception due to "+ex.getMessage());
        }
    }
    //Disconnect connection
    public static void disconnect(){
        try{
            conn.close();
            System.out.println("Connection closed");
        }catch (NullPointerException ex){
            System.out.println("Exception due to "+ex.getMessage());
        }
        catch (SQLException ex){
            System.out.println("Exception due to "+ex.getMessage());
        }
    }
    //Main method
    public static void main(String[] args) {
       connect();
       disconnect();
    }
}
