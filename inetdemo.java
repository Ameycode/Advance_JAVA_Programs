import java.net.*;
import java.util.*;
class inetdemo
{
	public static void main(String arg[])throws UnknownHostException
	{
		System.out.println("enter host..:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		InetAddress i=InetAddress.getByName(s);
		System.out.println("Host: "+i.getHostName());
		System.out.println("address: "+i.getHostAddress());
	}
}