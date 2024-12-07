import java.awt.*;
public class listdemo extends Frame
{
	listdemo()
	{
		setVisible(true);
		setSize(500,300);
		setTitle("Using list");
		setLayout(null);

		
		List l=new List();
		l.add("pune");
		l.add("mumbai");
		l.add("nagpur");
		l.add("nashik");
		l.add("solapur");
		l.setBounds(100,100,100,100);
		add(l);
	}
	public static void main(String arg[])
	{
		new listdemo();
	}
}