package cn.gtmap.constractor_method;

public class Animal {
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    
    //带一个参数的构造方法
    public Animal(String animalName){ 
        name = animalName;
    }
      
    //带两个参数的构造方法
    public Animal(String animalName,float animalHp){ 
        name = animalName;
        hp = animalHp;
    }
    
    public Animal(String animalName,float animalHp,float animalArmor,int animalMoveSpeed){
    	name = animalName;
    	hp = animalHp;
    	armor = animalArmor;
    	moveSpeed = animalMoveSpeed;
    }
    
    public static void main(String[] args) {
		Animal dog = new Animal("狗狗");
		Animal cat =new Animal("猫猫",345.3f);
		Animal fish = new Animal("鱼",343.3f,27.3f,345);
	}
}
