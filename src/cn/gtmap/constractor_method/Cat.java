package cn.gtmap.constractor_method;

/**
 * ��ʽ�Ĺ��췽��
 * @author Administrator
 *
 */
public class Cat {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
    //����޲εĹ��췽���������д��
    //�ͻ�Ĭ���ṩһ���޲εĹ��췽��
    //  public Cat(){ 
    //      System.out.println("����Cat�Ĺ��췽��");
    //  }
	
	public static void main(String[] args) {
		Cat jerry=new Cat();
		jerry.name = "����";
		jerry.hp = 50.3f;
		jerry.armor = 34.4f;
		jerry.moveSpeed = 400;
	}
}
