import javax.swing.*;
public class JpassDemo extends JFrame
{
	JpassDemo()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		JPasswordField p1=new JPasswordField();
		p1.setBounds(100,100,100,50);
		p1.setEchoChar('#');
		add(p1);
	}

	public static void main(String arg[])
	{
		new JpassDemo();
	}
}