package cn.gtmap.constractor_method;

/**
 * ����ṩ��һ���вεĹ��췽��
 * @author Administrator
 *
 */
public class Dog {
	
    String name; //����
    
    float hp; //Ѫ��
      
    float armor; //����
      
    int moveSpeed; //�ƶ��ٶ�
	
    //�вεĹ��췽��
    //Ĭ�ϵ��޲εĹ��췽����ʧЧ��
    public Dog(String dogName){
    	name = dogName;
    }
    
    public static void main(String[] args) {
		Dog hashiqi = new Dog("��ʿ��");
		//Dog alasijia = new Dog();//�޲εĹ��췽����ľ���ˡ�
	}
}
