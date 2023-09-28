package project;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update extends Conn{

    Update() throws ClassNotFoundException, SQLException {
        super();
    }
    public void update(int id,String name) throws SQLException
    {
        String q="update sinfo set name=? where id=?";

        PreparedStatement ps=super.con.prepareStatement(q);

        ps.setString(1, name);
        ps.setInt(2, id);
       
        int i=0;
        i=ps.executeUpdate();
       
        if(i!=0)
        {
            System.out.println("Updated");
        }else
        {
            System.out.println("Not Updated");
    }
        super.con.close();
   
    }
}