import java.awt.event.*;
import java.awt.*;
public class keyDemo extends Frame implements KeyListener
{
	keyDemo()
	{
		setVisible(true);
		setSize(100,100);
		
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		System.out.println("Key Pressed");
	}
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	public static void main(String arg[])
	{
		new keyDemo();
	}
}