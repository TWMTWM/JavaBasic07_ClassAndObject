package cn.gtmap.constractor_method;

/**
 * ����ͨ����һ�������췽��Ҳ��������
 * @author Administrator
 *
 */
public class Fish {
    String name; //����
    
    float hp; //Ѫ��
       
    float armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    //��һ�������Ĺ��췽��
    public Fish(String fishName){
    	name = fishName;
    }
    
    //�����������Ĺ��췽��
    public Fish(String fishName,float fishHp){
    	name = fishName;
    	hp = fishHp;
    }
    
    public static void main(String[] args) {
		Fish caoyu = new Fish("����");
		Fish liyu = new Fish("����",34.5f);
	}
}
