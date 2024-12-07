import javax.swing.*;
import java.awt.event.*;
class JprogressBtn extends JFrame implements ActionListener
{
	JButton b1;
	JProgressBar p1;
	
	JprogressBtn()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		p1=new JProgressBar(0,100);
		p1.setBounds(100,100,150,50);
		add(p1);
		
		b1=new JButton("SET");
		b1.setBounds(100,170,100,50);
		b1.addActionListener(this);
		add(b1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		p1.setStringPainted(true);
		
		for(int i=0; i<=100; i++)
		{
			p1.setValue(i);
			try
			{
				Thread.sleep(5);
			}
			catch(Exception e){}
		}
	}
	public static void main(String arg[])
	{
		new JprogressBtn();
	}
}