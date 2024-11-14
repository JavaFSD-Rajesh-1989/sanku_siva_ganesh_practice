import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcexp1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paper","root","G2002@uruv#");
		// PreparedStatement ps=con.prepareStatement("INSERT INTO students(sid,name,age,grade)values (?,?,?,?)");
		 PreparedStatement ps=con.prepareStatement("delete from students where sid=?");
    	 ps.setInt(1, 1);
//		 ps.setString(2,"manny");
//		 ps.setInt(3, 19);
//		 ps.setString(4, "p");
		 int i=ps.executeUpdate();
		 if(i>0)
		 {
			 System.out.println("done");
		 }
		 else
		 {
			 System.out.println("undone");
		 }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
