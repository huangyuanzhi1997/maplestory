package allbutton;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class ButtonBase extends JPanel
{
	protected int state=0;/**״̬
	* 0=δ����
	* 1=����
	* 2=����
	* */
	public int getstate()
	{
		return state;
	}
	public void setstate(int m)//�ı�״̬
	{
		state=m;
	}
	public abstract void paint(Graphics g);
}
