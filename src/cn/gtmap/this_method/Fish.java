package cn.gtmap.this_method;

public class Fish {
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    
    public Fish(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    public Fish(String name,float hp,float armor,int moveSpeed){
    	this(name,hp);
    	//this.name = name;
    	//this.hp = hp;
    	this.armor = armor;
    	this.moveSpeed = moveSpeed;
    }
    
    public static void main(String[] args) {
		Fish fish = new Fish("草鱼", 345.3f);
		System.out.println(fish.name);
		
		Fish fish2 = new Fish("鲤鱼", 433.4f,27.3f,345);
		System.out.println(fish2.moveSpeed);
		System.out.println(fish2.name);
	}
    
}
