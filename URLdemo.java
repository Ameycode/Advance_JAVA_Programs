import java.net.*;
public class URLdemo
{
	public static void main(String arg[]) throws Exception
	{
		URL u=new URL("http://www.msbte.org.in:8080/index.html");
		System.out.println("host "+u.getHost());
		System.out.println("Protocol "+u.getProtocol());
		System.out.println("port "+u.getPort());
		System.out.println("file "+u.getFile());
	}
}