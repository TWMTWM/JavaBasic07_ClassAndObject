package cn.gtmap.method_overload;

/**
 * ��ϰ����������
 * @author Administrator
 *
 */
public class Supporter extends Hero{
	public void heal(){
		System.out.println(name + "��һ��Ӣ�۽������ƣ�����֪��������˭" );
	}
	
	public void heal(Hero h1){
		System.out.println(name + "��" + h1.name + "������һ������ ");
	}
	
	public void heal(Hero h1,int hp){
		System.out.println(name + "ͬʱ��" + h1.name + "������" + hp + "Ѫ��");
	}
	
	public static void main(String[] args) {
		Supporter supporter = new Supporter();
		supporter.name = "������";
		Hero h1 = new Hero();
		h1.name = "����";
		supporter.heal();
		supporter.heal(h1);
		supporter.heal(h1, 30);
	}
	
}
