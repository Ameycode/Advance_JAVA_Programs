import java.awt.event.*;
import java.awt.*;
public class mouseDemo extends Frame implements MouseMotionListener
{
	mouseDemo()
	{
		setVisible(true);
		setSize(100,100);
		
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("dragged");
	}
	public void mouseMoved(MouseEvent me){
		System.out.println("moved");
	}
	public static void main(String arg[])
	{
		new mouseDemo();
	}
}