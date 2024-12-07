import javax.swing.*;
public class Jtabledemo extends JFrame
{
	Jtabledemo()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		String data[][]={{"aaa","56","A"},{"bbb","89","B+"},{"ccc","75","B"},{"ddd","93","A+"},{"eee","44","c+"}};
		String col[]={"Name","Percentage","Grade"};
		JTable t1=new JTable(data, col);
		t1.setBounds(100,100,200,100);
		add(t1);
	}
	public static void main(String arg[])
	{
		new Jtabledemo();
	}
}