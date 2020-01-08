package cn.gtmap.constractor_method;

/**
 * 如果提供了一个有参的构造方法
 * @author Administrator
 *
 */
public class Dog {
	
    String name; //姓名
    
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
	
    //有参的构造方法
    //默认的无参的构造方法就失效了
    public Dog(String dogName){
    	name = dogName;
    }
    
    public static void main(String[] args) {
		Dog hashiqi = new Dog("哈士奇");
		//Dog alasijia = new Dog();//无参的构造方法“木有了”
	}
}
