package menu;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;


public class Menu extends JPanel
{
	protected int state=0;/**״̬
	* 0=δ����
	* 1=����
	* */
	public int getstate()
	{
		return state;
	}
	public void setstate(int m)//�ı�״̬
	{
		state=m;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�˵�/�˵�.png"),0,0,this);
	}
}
