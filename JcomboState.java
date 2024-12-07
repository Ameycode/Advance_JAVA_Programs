import javax.swing.*;
public class JcomboState extends JFrame
{
	JcomboState()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("Using JcomboBox states");
		setLayout(null);
		
		String s[]={"maharashtra","UP","MP","uttrakhand","Himachal pradesh"};
		JComboBox b1=new JComboBox(s);
		b1.setBounds(100,100,100,50);
		add(b1);
	}
	public static void main(String arg[])
	{
		new JcomboState();
	}
}