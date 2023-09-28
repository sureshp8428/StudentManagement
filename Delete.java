package project;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete extends Conn {
    Delete() throws ClassNotFoundException,SQLException
    {
        super();
    }
    public void delete(int id) throws SQLException
    {
        String q="delete from sinfo where id=?";
       
        PreparedStatement ps=super.con.prepareStatement(q);
        ps.setInt(1, id);
       
        int i=ps.executeUpdate();
        if(i!=0)
        {
            System.out.println("delete Sucesfully");
        }else
        {

            System.out.println("delete UnSucesfully");
        }
    }

}

