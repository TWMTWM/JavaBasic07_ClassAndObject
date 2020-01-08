package cn.gtmap.this_method;

/**
 * 通过this关键字访问对象的属性
 *
 */
public class Cat {
    String name; //姓名
    
    float hp; //血量
     
    float armor; //护甲
     
    int moveSpeed; //移动速度
    
    //参数名和属性名一样
    //在方法体中，只能访问到参数name
    public void setName1(String name){
    	name = name;
    }
 
    //为了避免setName1中的问题，参数名不得不使用其他变量名
    public void setName2(String catName){
        name = catName;
    }
    
    //通过this访问属性
    public void setName3(String name){
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }
    
    public static void main(String[] args) {
		Cat c = new Cat();
		
		c.setName1("猫1");
		System.out.println(c.name);
		
		c.setName2("猫2");
		System.out.println(c.name);
		
		c.setName3("猫3");
		System.out.println(c.name);
	}
    
}
