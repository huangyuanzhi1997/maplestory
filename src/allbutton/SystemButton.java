package allbutton;

import java.awt.*;

import javax.swing.*;

public class SystemButton extends JPanel
{
	private int state=0;/**״̬
	* 0=δ����
	* 1=����
	* 2=����
	* */
	
	public void setstate(int m)
	{
		state=m;
	}
	
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/ϵͳ/δ����.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/ϵͳ/����.png"),0,0,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/ϵͳ/����.png"),0,0,this);break;
		}
	}
}
