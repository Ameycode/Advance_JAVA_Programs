import java.awt.*;
public class menuDemo extends Frame
{
	menuDemo()
	{
		setVisible(true);
		setSize(1000,1000);
		setTitle("Using menu's");
		
		MenuBar mb1=new MenuBar();
		setMenuBar(mb1);
		Menu m1=new Menu("File");
		MenuItem mi1=new MenuItem("save");
		m1.add(mi1);
		MenuItem mi2=new MenuItem("save as");
		m1.add(mi2);
		MenuItem mi3=new MenuItem("edit");
		m1.add(mi3);
		mb1.add(m1);
	}
	public static void main(String arg[])
	{
		new menuDemo();
	}
}