import java.sql.*;
class empdata
{
	public static void main(String arg[])
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:emp");
		Statement st=c.createStatement();
		int r=st.executeUpdate("create table emp(eid int, ename varchar(20))");
		ResultSet rs=st.executeQuery("select * from employe");
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