import java.awt.*;
public class BtnNo extends Frame
{
	BtnNo()
	{
		setVisible(true);
		setSize(1000,1000);
		setTitle("Using btn display 0 to 9");
		GridLayout g=new GridLayout(3,3,2,3);
		setLayout(g);
		int i;
		

		for(i=0;i<=9;i++)
		{
			add(new Button("B"+i));
		}
	}
	public static void main(String arg[])
	{
		new BtnNo();
	}
}