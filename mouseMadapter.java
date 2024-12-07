import java.awt.event.*;
import java.awt.*;
public class mouseMadapter extends MouseAdapter
{
	Frame f;
	mouseMadapter()
	{
		f=new Frame();
		f.setVisible(true);
		f.setSize(100,100);
		
		f.addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("dragged");
	}
	
	public static void main(String arg[])
	{
		new mouseMadapter();
	}
}