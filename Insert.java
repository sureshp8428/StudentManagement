package project;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert extends Conn{

    Insert() throws ClassNotFoundException, SQLException {
        super();
    }
   
    public int insert(int id,String name,String doj,float avg) throws SQLException
    {
        int i=0;
        String q="insert into sinfo values(?,?,?,?)";
       
        PreparedStatement ps=super.con.prepareStatement(q);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, doj);
        ps.setFloat(4, avg);
       
        i=ps.executeUpdate();

        super.con.close();
        return i;
    }
   

}