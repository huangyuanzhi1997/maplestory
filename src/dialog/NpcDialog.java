package dialog;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class NpcDialog  extends JPanel
{
	private int num;//NPC���
	private int progress;//����
	public NpcDialog(){}
	public void setDialog(int m_num,int m_progress)
	{
		num=m_num;
		progress=m_progress;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�Ի���/�Ի�����.png"),0,0,this);
		switch(num)
		{
		case 0:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/ϣ��˹/ϣ��˹.png"),15,40,this);
			g.drawString("��ӭ����ʥ��...", 165, 30);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�Ϲ���/�Ϲ���.png"),15,40,this);
			switch(progress)
			{
			case 0:
			{
				g.drawString("����������������ʿ����ӭ����ʥ�أ�", 165, 30);
				g.drawString("����ʥ�ش���һ��ʮ��Σ����״̬����ĵ������ҿ�����ϣ����", 165, 45);
				break;
			}
			case 1:
			{
				g.drawString("�ҽ�����˵�����ڵ����������Ҫ����һ��˼·��", 165, 30);
				g.drawString("���ȵ���תת�ɣ�(����ƺ�������ˣ�ȥ����к���)", 165, 45);
				break;
			}
			case 2:
			{
				g.drawString("(������ȥ����ߵ�����˴���к��ɣ�)", 165, 30);
				break;
			}
			case 3:
			{
				g.drawString("�����ˡ�������Ӧ�ÿ����ˣ���λ��ʿ�ų���״̬...", 165, 30);
				g.drawString("�ǵģ����Ǳ���ħ��ʦ�������ֶο��������飡", 165, 45);
				g.drawString("���������ǣ�����ʥ�أ�������֮�⣬ֻʣ���Һ�Ů����...", 165, 60);
				g.drawString("��û����������֪����Ů����߻����ʿ���Ѿ�������...", 165, 75);
				g.drawString("�Ҹ����ҵֿ���һ���Ҵ������ǵ�αװ��Ů�ʾ�Σ���ˡ�", 165, 90);
				g.drawString("���ʺ�ħ��ʦΪʲô��������(���ٴκ��ҶԻ�)", 165, 105);
				break;
			}
			case 4:
			{
				g.drawString("��ħ��ʦ������ҪȡŮ��������", 165, 30);
				g.drawString("�����Ů��ӵ��ǿ���������������в����ħ��ʦ", 165, 45);
				g.drawString("��ħ��ʦ�ɵ�ȴ������Ů�ʵ����������Կ�����ʥ��", 165, 60);
				g.drawString("�ÿ�����Ǳ����Ů�����...", 165, 75);
				g.drawString("���ڵȴ�����Ů�ʵ�ʱ���������Ʋ⣬���ʱ���Ѿ���Զ��", 165, 90);
				g.drawString("���޷���������֮�Կ���ʵ�в�����������...", 165, 105);
				g.drawString("�������Ļ����������...", 165, 120);
				g.drawString("(���ٺ��ҶԻ�)", 165, 135);
				break;
			}
			case 5:
			{
				g.drawString("ʵ���Ǻ���Ҫ�ġ��Ƚ��ȼ�������10���ɣ�", 165, 30);
				g.drawString("�����߻�ɱ�����Ƶ�ʿ�����Ի�ȡ����ֵ��", 165, 45);
				break;
			}
			case 6:
			{
				g.drawString("�㻹û�е���10����", 165, 30);
				break;
			}
			case 7:
			{
				g.drawString("�ܺã����Ѿ��ﵽ��10����", 165, 30);
				g.drawString("(���ٺ��ҶԻ�)", 165, 45);
				break;
			}
			case 8:
			{
				g.drawString("ʥ���е������Ǻ�ħ��ʦ�Ŀ���", 165, 30);
				g.drawString("���Ů����˵�Ǻܴ����в", 165, 45);
				g.drawString("����ɱ��̫�࣬��Ȼ�������ħ��ʦע���", 165, 60);
				g.drawString("(���ٺ��ҶԻ�)", 165, 75);
				break;
			}
			case 9:
			{
				g.drawString("����һֱ�ߣ�ǰ��  [ǰ��1]��[ǰ��2]", 165, 30);
				g.drawString("����l�̿͡��ִ̿͸�  30 ֻ�ɣ�", 165, 45);
				break;
			}
			case 10:
			{
				g.drawString("��ȷ���Ѿ������� �l�̿͡��ִ̿͸�  30 ֻ��", 165, 30);
				g.drawString("(�����񴰿ڿ��Բ鿴����������)", 165, 45);
				break;
			}
			case 11:
			{
				g.drawString("����ɵĺܺã�", 165, 30);
				g.drawString("(���ٺ��ҶԻ�)", 165, 45);
				break;
			}
			case 12:
			{
				g.drawString("��һ���ֿ��������������л���˾�����װ��", 165, 30);
				g.drawString("������Ҫ���������ǵ�ʵ��", 165, 45);
				g.drawString("(���ٺ��ҶԻ�)", 165, 60);
				break;
			}
			case 13:
			{
				g.drawString("ͨ��  [ǰ��1] ��ͼ����Ĵ�����ǰ�� [������]", 165, 30);
				g.drawString("����Ӣ�l�̿͡���Ӣ�ִ̿͸�  30 ֻ�ɣ�", 165, 45);
				break;
			}
			case 14:
			{
				g.drawString("��ȷ���Ѿ������� ��Ӣ�l�̿͡���Ӣ�ִ̿͸�  30 ֻ��", 165, 30);
				g.drawString("(�����񴰿ڿ��Բ鿴����������)", 165, 45);
				break;
			}
			case 15:
			{
				g.drawString("����ɵĺܺã�", 165, 30);
				g.drawString("(���ٺ��ҶԻ�)", 165, 45);
				break;
			}
			case 16:
			{
				g.drawString("ʥ�ص�������ڽ�����ת��", 165, 30);
				g.drawString("�������ڿ��Կ���������ħ��ʦ������", 165, 45);
				g.drawString("(���ٺ��ҶԻ�)", 165, 60);
				break;
			}
			case 17:
			{
				g.drawString("��û���㹻ʵ��֮ǰ�����������", 165, 30);
				g.drawString("�������ȡԮ���Ǹ��ܲ���İ취", 165, 45);
				g.drawString("�Ҳ����뿪Ů�ʣ������������ͽ�������", 165, 60);
				g.drawString("(���ٺ��ҶԻ�)", 165, 75);
				break;
			}
			case 18:
			{
				g.drawString("ͨ��[ǰ��2]��ߵĴ�������ð�յ����������ɣ�", 165, 30);
				break;
			}
			case 19:
			{
				g.drawString("ͨ��[ǰ��2]��ߵĴ�������ð�յ����������ɣ�", 165, 30);
				break;
			}
			case 20:
			{
				g.drawString("(�������ľ�����߸��Ϲ���)", 165, 30);
				break;
			}
			case 21:
			{
				g.drawString("ʲô����ɫʯ�ˣ������ߴ�", 165, 30);
				g.drawString("����������ι�������˿������", 165, 45);
				g.drawString("��...�ѵ��ǣ�", 165, 60);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 75);
				break;
			}
			case 22:
			{
				g.drawString("��˵�е�...", 165, 30);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 75);
				break;
			}
			case 23:
			{
				g.drawString("��˵�еģ�����������", 165, 30);
				g.drawString("�桤24K��ǿ������ͭӲ����ڹ����������ĺ͹�����ĵ���", 165, 45);
				g.drawString("������Ź�����ܼ�����������֮��Բ����ɢ��֮���������", 165, 60);
				g.drawString("�Ӵ�����뵼�弰����Ӧ��֮��ԴӲ��������Ų���������", 165, 75);
				g.drawString("��Ӳ���Լ�����ͭӲ��봽������������������ʯ����2009", 165, 90);
				g.drawString("ţ���޶��ر��ǿ�棿������������������������������",165,105);
				g.drawString("(����������)", 165, 120);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 135);
				break;
			}
			case 24:
			{
				g.drawString("�������ˣ���һ�ж��Ǻ�ħ��ʦ����ı��", 165, 30);
				g.drawString("������������һ�������ʯ����", 165, 45);
				g.drawString("�����Ǻ�����ǰ��������������ػ��ͷ�����", 165, 60);
				g.drawString("�����������ħ��ʦ��������������ʥ�ر�Ե", 165, 75);
				g.drawString("�����뵽��ֻ��һ���ǳ��ֲ�����ı����", 165, 90);
				g.drawString("ֻ�к�ħ��ʦ�����ĳ���а����ı����",165,105);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 120);
				break;
			}
			case 25:
			{
				g.drawString("��ħ��ʦ����Ů�ʵ�����", 165, 30);
				g.drawString("����...��...��֪������ʲô����..", 165, 45);
				g.drawString("������ʥ�ظ���Χ��������", 165, 60);
				g.drawString("���ֱ������...Ȧ��Ů�ʣ���", 165, 75);
				g.drawString("�ɶ�ʥ�����ܵ���˳��裬Ϊʲô��·��û����Ԯ�Ķ���?!", 165, 90);
				g.drawString("�ѵ�...��Ҷ��Ѿ������ѱ�����...",165,105);
				g.drawString("���Ǳ�������ĶԴ�������飡", 165, 120);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 135);
				break;
			}
			case 26:
			{
				g.drawString("�����Ů�ʻ�����������������ϣ����", 165, 30);
				g.drawString("���ܷ���ʲô���飬һ��Ҫ�ȳ�Ů�ʣ�", 165, 45);
				g.drawString("������ʥ�ظ���Χ��������", 165, 60);
				g.drawString("���ֱ������...Ȧ��Ů�ʣ���", 165, 75);
				g.drawString("�ɶ�ʥ�����ܵ���˳��裬Ϊʲô��·��û����Ԯ�Ķ���?!", 165, 90);
				g.drawString("�ѵ�...��Ҷ��Ѿ������ѱ�����...",165,105);
				g.drawString("һ��...Ҫ��Ů���뿪���", 165, 120);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 135);
				break;
			}
			case 27:
			{
				g.drawString("���Һ�Ů�ʵ�ʵ�������޷�ͻ��ʯ�������", 165, 30);
				g.drawString("������ʿ����ȴ���ԣ�", 165, 45);
				g.drawString("����ʯ���˳��ֵĵط�������һ����Ϊ���ṩ���������壡", 165, 60);
				g.drawString("��Ȼ���ѣ������������ͻ��ʯ�����ػ���", 165, 75);
				g.drawString("����[��ɽ·1]���Ϸ��Ĵ����ż�������", 165, 90);
				g.drawString("��һ�����Եģ����ͣ�Ϊ��Ů�ʣ�",165,105);
				break;
			}
			case 28:
			{
				g.drawString("��ȥ����ɣ�Ϊ��Ů�ʣ�", 165, 30);
				break;
			}
			case 29:
			{
				g.drawString("(���������龰�����Ϲ���)", 165, 30);
				break;
			}
			case 30:
			{
				g.drawString("ԭ����ˣ����ÿ�ӡ��ʯ�˵�����Ϊʯ�����ṩ������", 165, 30);
				g.drawString("ֻҪ��ɱһ�������Ŀ�ӡʯ���ˣ�ʯ�����ػ���ͻ᲻������", 165, 45);
				g.drawString("�����ж��ɡ������Ҫ��ɱ10ֻ������", 165, 60);
				break;
			}
			case 31:
			{
				g.drawString("�����ж��ɡ���Ҫ��ɱ10ֻ��ӡʯ����", 165, 30);
				break;
			}
			case 32:
			{
				g.drawString("���ĺܺã��ػ����������ʧ�ˣ�", 165, 30);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 45);
				break;
			}
			case 33:
			{
				g.drawString("����һ�ֲ�������Ϣ", 165, 30);
				g.drawString("����[��ɽ·2]�Ϸ��Ĵ����ţ���������ɣ�", 165, 45);
				break;
			}
			case 34:
			{
				g.drawString("����[��ɽ·2]�Ϸ��Ĵ����ţ���������ɣ�", 165, 30);
				break;
			}
			
			}
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/�׹���������.png"),15,40,this);
			g.drawString("�������ˣ��Ǻǣ���Ů��Զһ�㣡", 165, 30);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/�����ȴ�����.png"),15,40,this);
			g.drawString("�������ˣ��Ǻǣ���Ů��Զһ�㣡", 165, 30);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/���ȴ�����.png"),15,40,this);
			g.drawString("�������ˣ��Ǻǣ���Ů��Զһ�㣡", 165, 30);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/�������ش�����.png"),15,40,this);
			g.drawString("�������ˣ��Ǻǣ���Ů��Զһ�㣡", 165, 30);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/���˴�����.png"),15,40,this);
			g.drawString("�������ˣ��Ǻǣ���Ů��Զһ�㣡", 165, 30);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/��/����.png"),15,40,this);
			switch(progress)
			{
			case 35:
			{
				g.drawString("���Ȼ�������ˡ�", 165, 30);
				break;
			}
			case 36:
			{
				g.drawString("��ȥ�ɣ�������ɱ�㡣", 165, 30);
				break;
			}
			case 39:
			{
				g.drawString("�ҽ����ȥ��", 165, 30);
				break;
			}
			}
			break;
		}
		case 8:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�Ի�.png"),15,40,this);
			switch(progress)
			{
			case 37:
			{
				g.drawString("�����ݺ�����Ľ�ʥ�󼪣���ȻҲ����ħ��ʦ��ʴ�����飡��", 165, 30);
				break;
			}
			case 38:
			{
				g.drawString("(Ϊ��������磬�ұ�������������������Ӯ��...)", 165, 30);
				break;
			}
			}
		}
		}
	}
}
