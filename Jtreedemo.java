import javax.swing.tree.*;
import javax.swing.*;
public class Jtreedemo extends JFrame
{
	Jtreedemo()
	{
		setVisible(true);
		setSize(500,500);
		
		DefaultMutableTreeNode n1=new DefaultMutableTreeNode("First");
		DefaultMutableTreeNode n2=new DefaultMutableTreeNode("1.First");
		DefaultMutableTreeNode n3=new DefaultMutableTreeNode("1.Second");
		n1.add(n2);
		n1.add(n3);
		n2.add(new DefaultMutableTreeNode("1.1.1"));
		n2.add(new DefaultMutableTreeNode("1.1.2"));
		n3.add(new DefaultMutableTreeNode("1.2.1"));
		n3.add(new DefaultMutableTreeNode("1.2.2"));
		JTree t=new JTree(n1);
		add(t);
	}
	public static void main(String arg[])
	{
		new Jtreedemo();
	}
}