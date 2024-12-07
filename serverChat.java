import java.net.*;
import java.io.*;
public class serverChat
{
	public static void main(String arg[])throws Exception
	{
		DataOutputStream dout;
		DataInputStream din;
		String str;
		BufferedReader br;
		
		ServerSocket ss=new ServerSocket(1010);
		Socket s=ss.accept();
		System.out.println("connected...!");
		do
		{
			System.out.println("Server..");
			br=new BufferedReader(new InputStreamReader(System.in));
			str=br.readLine();
			dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF(str);
			din=new DataInputStream(s.getInputStream());
			System.out.println("Client "+din.readUTF());
		}while(!str.equals("bye"));
		dout.close();
		s.close();
		ss.close();
	}
}