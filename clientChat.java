import java.net.*;
import java.io.*;
public class clientChat
{
	public static void main(String arg[])throws Exception
	{
		DataOutputStream dout;
		DataInputStream din;
		String str,s1;
		BufferedReader br;
		
		//ServerSocket ss=new ServerSocket(1010);
		Socket s=new Socket("LocalHost",1010);
		System.out.println("connected...!");
		do
		{
			din=new DataInputStream(s.getInputStream());
			s1=din.readUTF();
			System.out.println("Server "+s1);
			dout=new DataOutputStream(s.getOutputStream());
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client..");
			str=br.readLine();
			dout.writeUTF(str);
		}while(!s1.equals("bye"));
		dout.close();
		din.close();
		s.close();
	}
}