import java.sql.*;
class studupdate
{
	public static void main(String arg[])
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:stud");
		Statement st=c.createStatement();
		int r=st.executeUpdate("update Student set Name='John' where Name='jack'");
		ResultSet rs=st.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		c.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

// jdk 7 path must be set before running this program