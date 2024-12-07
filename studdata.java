import java.sql.*;
class studdata
{
	public static void main(String arg[])
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:stud");
		Statement st=c.createStatement();
		ResultSet rs=st.executeQuery("select rollno, name from Student where percentage > 70");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));
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