package cn.gtmap.biography;

/**
 * �������ʹ���
 * 	�ڷ����ڣ��޷��޸ķ�����Ļ������Ͳ���
 * @author Administrator
 *
 */
public class Hero {
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
     
    public Hero(){
         
    }
	
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    
    public void huixue(int xp){
    	hp =hp + xp;
    	//��Ѫ��Ϻ�Ѫƿ=0
    	xp = 0;
    }
    
	public static void main(String[] args) {
		Hero teemo = new Hero("��Ī",383f);
		int xueping = 100;
		teemo.huixue(xueping);
		System.out.println(xueping);
	}
}
