package object;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Monster extends JPanel
{
	private int MonsterID;
	private int zhuangtai=0;
	private int Target;//�����Ƿ��й���Ŀ��
	private int HP;//����Ѫ��
	private int Defense;//������
	private int DHP=0;//��Ѫ��
	private int x;
	private int y;
	private int bx;
	private int by;
	private int xmax;
	private int xmin;
	private int Offsetx;
	private int Offsety;
	public int getTarget()
	{
		return Target;
	}
	public int getID()
	{
		return MonsterID;
	}
	public void setTarget()
	{
		Target=1;
	}
	public Monster(int id,int m_x,int m_y,int m_xmax,int m_xmin)
	{
		MonsterID=id;
		switch(MonsterID)
		{
		case 0:
		{
			HP=1000;
			Defense=20;
			break;
		}
		case 1:
		{
			HP=5000;
			Defense=100;
			break;
		}
		case 2:
		{
			HP=10000;
			Defense=200;
			break;
		}
		case 3:
		{
			HP=50000;
			Defense=1000;
			break;
		}
		case 4:
		{
			HP=50000;
			Defense=1000;
			break;
		}
		case 5:
		{
			HP=100000;
			Defense=1000;
			break;
		}
		}
		xmax=m_xmax;
		xmin=m_xmin;
		Target=0;
		x=m_x;
		y=m_y;
		bx=x;
		by=y;
	}
	public int getxmax()
	{
		return xmax;
	}
	public int getxmin()
	{
		return xmin;
	}
	public void moveOxy(int m_x,int m_y)
	{
		Offsetx=m_x;
		Offsety=m_y;
	}
	public void movex(int m_x)
	{
		x+=m_x;
	}
	public int getHP()
	{
		return HP;
	}
	public void setzhuangtai(int m)
	{
		zhuangtai=m;
	}
	
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	public void Battack(int atk)
	{
		DHP=(atk-Defense)<=0?1:atk-Defense;
	}
	public int NewMonster()
	{
		x=bx;
		y=by;
		Target=0;
		switch(MonsterID)
		{
		case 0:
		{
			HP=1000;
			return 2000;
		}
		case 1:
		{
			HP=5000;
			return 1000;
		}
		case 2:
		{
			HP=10000;
			return 3000;
		}
		case 3:
		{
			HP=50000;
			return 10000;
		}
		case 4:
		{
			HP=50000;
			return 100000;
		}
		case 5:
		{
			HP=100000;
			return 100000;
		}
		}
		return 0;
	}
	public void paint(Graphics g)
	{
		switch(MonsterID)
		{
		case 0:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/վ��/��.gif"),x-Offsetx-41,y+Offsety-63,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/վ��/��.gif"),x-Offsetx-16,y+Offsety-63,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/�ƶ�/��.gif"),x-Offsetx-29,y+Offsety-58,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/�ƶ�/��.gif"),x-Offsetx-26,y+Offsety-58,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/������/��.png"),x-Offsetx-41,y+Offsety-72,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/������/��.png"),x-Offsetx-37,y+Offsety-72,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/����/��.gif"),x-Offsetx-151,y+Offsety-60,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�l�̿�/����/��.gif"),x-Offsetx-37,y+Offsety-60,this);break;
			}
			break;
		}
		case 1:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/վ��/��.gif"),x-Offsetx-48,y+Offsety-71,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/վ��/��.gif"),x-Offsetx-63,y+Offsety-71,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/�ƶ�/��.gif"),x-Offsetx-50,y+Offsety-71,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/�ƶ�/��.gif"),x-Offsetx-68,y+Offsety-71,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/������/��.png"),x-Offsetx-51,y+Offsety-89,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/������/��.png"),x-Offsetx-68,y+Offsety-89,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/����/��.gif"),x-Offsetx-67,y+Offsety-76,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�ִ̿�/����/��.gif"),x-Offsetx-78,y+Offsety-76,this);break;
			}
			
			break;
		}
		case 2:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/վ��/��.gif"),x-Offsetx-37,y+Offsety-67,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/վ��/��.gif"),x-Offsetx-28,y+Offsety-67,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/�ƶ�/��.gif"),x-Offsetx-39,y+Offsety-64,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/�ƶ�/��.gif"),x-Offsetx-25,y+Offsety-64,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/������/��.png"),x-Offsetx-45,y+Offsety-69,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/������/��.png"),x-Offsetx-50,y+Offsety-69,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/����/��.gif"),x-Offsetx-124,y+Offsety-128,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�l�̿�/����/��.gif"),x-Offsetx-29,y+Offsety-128,this);break;
			}
			//System.out.printf("%d\n",Offsetx);
			break;
		}
		case 3:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/վ��/��.gif"),x-Offsetx-41,y+Offsety-84,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/վ��/��.gif"),x-Offsetx-58,y+Offsety-84,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/�ƶ�/��.gif"),x-Offsetx-43,y+Offsety-84,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/�ƶ�/��.gif"),x-Offsetx-68,y+Offsety-84,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/������/��.png"),x-Offsetx-43,y+Offsety-93,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/������/��.png"),x-Offsetx-72,y+Offsety-93,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/����/��.gif"),x-Offsetx-84,y+Offsety-94,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ӣ�ִ̿�/����/��.gif"),x-Offsetx-97,y+Offsety-94,this);break;
			}
			break;
		}
		case 4:
		{
			switch(zhuangtai)
			{
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/ʯͷ��/�ƶ�/��.gif"),x-Offsetx-70,y+Offsety-110,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/ʯͷ��/�ƶ�/��.gif"),x-Offsetx-64,y+Offsety-110,this);break;
			}
			break;
		}
		case 5:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/վ��/��.gif"),x-Offsetx-118,y+Offsety-179,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/վ��/��.gif"),x-Offsetx-112,y+Offsety-179,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/�ƶ�/��.gif"),x-Offsetx-123,y+Offsety-175,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/�ƶ�/��.gif"),x-Offsetx-110,y+Offsety-175,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/������/��.png"),x-Offsetx-125,y+Offsety-207,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/������/��.png"),x-Offsetx-101,y+Offsety-207,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/����/��.gif"),x-Offsetx-213,y+Offsety-202,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ӡʯͷ��/����/��.gif"),x-Offsetx-218,y+Offsety-202,this);break;
			}
			break;
		}
		}
		
		if(zhuangtai==4||zhuangtai==5)
		{
			HP-=DHP;
			System.out.printf("HP=%d\n",HP);
			Target=1;
			int DOffset=0;
			while(DHP>0)
			{
				switch(DHP%10)
				{
				case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/0.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=37;break;
				case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/1.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=25;break;
				case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/2.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=34;break;
				case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/3.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=33;break;
				case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/4.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/5.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=34;break;
				case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/6.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/7.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=33;break;
				case 8:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/8.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				case 9:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/9.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				}
				DHP/=10;
			}
		}
		
	}
	
	
}
