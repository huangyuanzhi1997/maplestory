package object;
import java.awt.*;
import javax.swing.*;

public class Obj extends JPanel
{
	private int zhuangtai=2;//����״̬
	
	//��Ļ����
	private int x;
	private int y;
	
	public void setzhuangtai(int a)//����״̬
	{
		zhuangtai=a;
	}
	public void setxy(int m_x,int m_y)
	{
		x=m_x;
		y=m_y;
	}
	//��������Ļ���ƶ�
	public void movex(int m_x)
	{
		x+=m_x;
	}
	public void movey(int m_y)
	{
		y+=m_y;
	}
	
	//��ȡ�����ڵ�ͼ�ϵ�����
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	public Obj(int m_x,int m_y)//�����ʼ��Ļλ��
	{
		x=m_x;
		y=m_y;
	}
	
	public void paint(Graphics g)
	{
		
		switch(zhuangtai)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������0.png"),x-15,y-68,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������1.png"),x-15,y-68,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������2.png"),x-15,y-68,this);break;
		case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������3.png"),x-15,y-68,this);break;
		case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������0.png"),x-76,y-68,this);break;
		case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������1.png"),x-76,y-68,this);break;
		case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������2.png"),x-76,y-68,this);break;
		case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/������3.png"),x-76,y-68,this);break;
		case 8:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ��/�泯��վ.gif"),x-40,y-86,this);break;
		case 9:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ��/�泯��վ.gif"),x-24,y-86,this);break;
		case 10:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ծ/������.png"),x-40,y-90,this);break;
		case 11:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ծ/������.png"),x-25,y-90,this);break;
		case 12:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/ſ��/�泯��ſ��.png"),x-106,y-40,this);break;
		case 13:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/ſ��/�泯��ſ��.png"),x,y-40,this);break;
		case 14:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/0.png"),x-165,y-110,this);break;
		case 15:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/1.png"),x-165,y-110,this);break;
		case 16:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/2.png"),x-165,y-110,this);break;
		case 17:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/3.png"),x-165,y-110,this);break;
		case 18:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/4.png"),x-165,y-110,this);break;
		case 19:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/5.png"),x-165,y-110,this);break;
		case 20:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/6.png"),x-165,y-110,this);break;
		case 21:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/7.png"),x-165,y-110,this);break;
		case 22:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/8.png"),x-165,y-110,this);break;
		case 23:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/0.png"),x-115,y-110,this);break;
		case 24:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/1.png"),x-115,y-110,this);break;
		case 25:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/2.png"),x-115,y-110,this);break;
		case 26:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/3.png"),x-115,y-110,this);break;
		case 27:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/4.png"),x-115,y-110,this);break;
		case 28:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/5.png"),x-115,y-110,this);break;
		case 29:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/6.png"),x-115,y-110,this);break;
		case 30:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/7.png"),x-115,y-110,this);break;
		case 31:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�������/��/8.png"),x-115,y-110,this);break;
		case 32:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/������/0.png"),x-27,y-70,this);break;
		case 33:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/������/1.png"),x-27,y-70,this);break;
		
		}
		g.drawString("��Ļλ�ã�"+"x="+Integer.toString(x)+"y="+Integer.toString(y),645,525);
	}
}
