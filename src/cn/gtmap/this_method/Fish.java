package cn.gtmap.this_method;

public class Fish {
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
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
		Fish fish = new Fish("����", 345.3f);
		System.out.println(fish.name);
		
		Fish fish2 = new Fish("����", 433.4f,27.3f,345);
		System.out.println(fish2.moveSpeed);
		System.out.println(fish2.name);
	}
    
}
