package cn.gtmap.this_method;

/**
 * ͨ��this���������Ĺ��췽��
 * 	���Ҫ��һ�����췽���У�������һ�����췽��������ʹ��this()
 * @author Administrator
 *
 */
public class Dog {
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
    //��һ�������Ĺ��췽��
    public Dog(String name){
        System.out.println("һ�������Ĺ��췽��");
        this.name = name;
    }
    
    //�����������Ĺ��췽��
    public Dog(String name,float hp){
    	this(name);
    	System.out.println("���������Ĺ��췽��");
    	this.hp = hp;
    }
    
    public static void main(String[] args) {
		Dog dog = new Dog("����˹��",364.3f);
		System.out.println(dog.name);
	}
    
}
