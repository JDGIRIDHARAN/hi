package pack;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Delete extends conn {
	   public Delete() throws ClassNotFoundException, SQLException {
	       super();
	   }
	   public void delete(int id) throws SQLException
	   {
	       String q="delete from crud where id=?";
	       PreparedStatement ps=con.prepareStatement(q);
	       ps.setInt(1, id);
	       int i=0;
	       i=ps.executeUpdate();
	       if(i!=0)
	       {
	           System.out.println("Deleted");
	       }else
	       {
	           System.out.println("Not Deleted");
	       }
	       con.close();
	   }
	}