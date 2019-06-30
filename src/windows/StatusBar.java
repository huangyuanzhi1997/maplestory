package windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.*;

public class StatusBar extends JPanel
{
	private int lv;//��ǰ�ȼ�
	
	private int hp;//��ǰѪ��
	private int mp;//��ǰ����
	private int exp;//��ǰ����ֵ
	
	private int allhp;//��Ѫ��
	private int allmp;//������
	private int allexp;//�ܾ���ֵ
	
	private int length=142;//��󳤶�

	private int atk;
	public StatusBar()//״̬����ʼ��
	{
		try 
		{
			Scanner in=new Scanner(Paths.get("./��Ϸ�浵/Player.txt"));
			lv=in.nextInt();
			hp=in.nextInt();
			mp=in.nextInt();
			exp=in.nextInt();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		allhp=1000+200*(lv-1);
		allmp=1000+50*(lv-1);
		allexp=500+1000*(lv-1);
		atk=lv*500;
	}
	public int getatk()
	{
		return atk;
	}
	public void addexp(int m_exp)
	{
		exp+=m_exp;
		if(exp>=allexp)
		{
			exp=0;
			lv++;
			allhp=1000+200*(lv-1);
			allmp=1000+50*(lv-1);
			allexp=500+1000*(lv-1);
			hp=allhp;
			mp=allmp;
			atk=lv*500;
		}
	}
	
	public int getLV()
	{
		return lv;
	}
	
	
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/״̬��/״̬��.png"),0,0,this);

		g.setColor(Color.RED); //Ѫ��
		g.fillRect(141, 23, (int)((double)hp/allhp*length), 15);
		g.setColor(Color.BLUE); //����
		g.fillRect(340, 23, (int)((double)mp/allmp*length), 15);
		g.setColor(Color.YELLOW); //������
		g.fillRect(539, 23, (int)((double)exp/allexp*length), 15);
		
		//���ֱ���6.7619 /[����3
		String hptxt="["+Integer.toString(hp)+"/"+Integer.toString(allhp)+"]";
		int hptxtnuml=Integer.toString(hp).length()+Integer.toString(allhp).length();//Ѫ��������ʾ�����ֳ���
		int hptxtx=272-(int)(hptxtnuml*6.7619);//��Ӧ������
		
		String mptxt="["+Integer.toString(mp)+"/"+Integer.toString(allmp)+"]";
		int mptxtnuml=Integer.toString(mp).length()+Integer.toString(allmp).length();//����������ʾ�����ֳ���
		int mptxtx=471-(int)(mptxtnuml*6.7619);//��Ӧ������
		
		String exptxt="["+Integer.toString(exp)+"/"+Integer.toString(allexp)+"]";
		int exptxtnuml=Integer.toString(exp).length()+Integer.toString(allexp).length();//����������ʾ�����ֳ���
		int exptxtx=670-(int)(exptxtnuml*6.7619);//��Ӧ������
		
		
		g.setColor(Color.WHITE);
		g.drawString(hptxt, hptxtx,34);
		g.drawString(mptxt, mptxtx,34);
		g.drawString(exptxt, exptxtx,34);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 25));//��������
		g.drawString(Integer.toString(lv), 50,38);//�ȼ�
		
		
		
	}
}
