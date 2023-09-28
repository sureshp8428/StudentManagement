package project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read extends Conn{

    Read() throws ClassNotFoundException, SQLException {
        super();
    }
   
    public void read(int id) throws SQLException
    {
        String q="select * from sinfo where id=?";
       
        PreparedStatement ps=super.con.prepareStatement(q);
        ps.setInt(1, id);
       
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            System.out.println("Id:"+rs.getInt("id"));
            System.out.println("Name:"+rs.getString("name"));
            System.out.println("DOJ:"+rs.getString("doj"));
            System.out.println("Average:"+rs.getFloat("aveg"));
        }
        super.con.close();
    }
   

}