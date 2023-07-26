package pack;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insert extends conn {
	   public Insert() throws ClassNotFoundException, SQLException {
	       super();
	   }
	   public int insert(int Id,String Name,long Salary)
	           throws SQLException
	   {
	       int i=0;
	       String q="insert into crud values(?,?,?)";
	       PreparedStatement ps=con.prepareStatement(q);
	       ps.setInt(1, Id);
	       ps.setString(2, Name);
	       ps.setLong(3, Salary);
	       i=ps.executeUpdate();
	       con.close();
	       return i;
	   }
	}