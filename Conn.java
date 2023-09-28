package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    public Connection con;
    Conn() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/std";
        String user="root";
        String pass="";
        con=DriverManager.getConnection(url,user,pass);
       
       
    }

}