import java.awt.*;
public class BtnPosition extends Frame
{
	BtnPosition()
	{
		setVisible(true);
		setSize(1000,1000);
		setTitle("Using btn for border Layout");
		BorderLayout b=new BorderLayout();
		setLayout(b);
		
		Button b1=new Button("north");
		add(b1,BorderLayout.NORTH);
		Button b2=new Button("south");
		add(b2,BorderLayout.SOUTH);
		Button b3=new Button("east");
		add(b3,BorderLayout.EAST);
		Button b4=new Button("west");
		add(b4,BorderLayout.WEST);
		Button b5=new Button("Center");
		add(b5,BorderLayout.CENTER);
	}
	public static void main(String arg[])
	{
		new BtnPosition();
	}
}