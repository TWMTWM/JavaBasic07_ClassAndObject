package cn.gtmap.constractor_method;

/**
 * 隐式的构造方法
 * @author Administrator
 *
 */
public class Cat {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
    //  public Cat(){ 
    //      System.out.println("调用Cat的构造方法");
    //  }
	
	public static void main(String[] args) {
		Cat jerry=new Cat();
		jerry.name = "杰瑞";
		jerry.hp = 50.3f;
		jerry.armor = 34.4f;
		jerry.moveSpeed = 400;
	}
}
