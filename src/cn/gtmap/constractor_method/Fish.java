package cn.gtmap.constractor_method;

/**
 * 和普通方法一样，构造方法也可以重载
 * @author Administrator
 *
 */
public class Fish {
    String name; //姓名
    
    float hp; //血量
       
    float armor; //护甲
       
    int moveSpeed; //移动速度
    
    //带一个参数的构造方法
    public Fish(String fishName){
    	name = fishName;
    }
    
    //带两个参数的构造方法
    public Fish(String fishName,float fishHp){
    	name = fishName;
    	hp = fishHp;
    }
    
    public static void main(String[] args) {
		Fish caoyu = new Fish("草鱼");
		Fish liyu = new Fish("鲤鱼",34.5f);
	}
}
