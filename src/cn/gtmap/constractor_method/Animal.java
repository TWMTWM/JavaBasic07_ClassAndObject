package cn.gtmap.constractor_method;

public class Animal {
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
    //��һ�������Ĺ��췽��
    public Animal(String animalName){ 
        name = animalName;
    }
      
    //�����������Ĺ��췽��
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
		Animal dog = new Animal("����");
		Animal cat =new Animal("èè",345.3f);
		Animal fish = new Animal("��",343.3f,27.3f,345);
	}
}
