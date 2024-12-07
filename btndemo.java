import java.awt.*;
public class btndemo extends Frame
{
	btndemo()
	{
		setVisible(true);
		setSize(500,300);
		setTitle("Using Lable");
		setLayout(null);
		
		Label l=new Label("Welcome to JAVA");
		l.setBounds(100,100,100,50);
		add(l);
	}
	public static void main(String arg[])
	{
		new btndemo();
	}
}