package cn.gtmap.this_method;

/**
 * ͨ��this�ؼ��ַ��ʶ��������
 *
 */
public class Cat {
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
    
    //��������������һ��
    //�ڷ������У�ֻ�ܷ��ʵ�����name
    public void setName1(String name){
    	name = name;
    }
 
    //Ϊ�˱���setName1�е����⣬���������ò�ʹ������������
    public void setName2(String catName){
        name = catName;
    }
    
    //ͨ��this��������
    public void setName3(String name){
        //name������ǲ���name
        //this.name�����������name
        this.name = name;
    }
    
    public static void main(String[] args) {
		Cat c = new Cat();
		
		c.setName1("è1");
		System.out.println(c.name);
		
		c.setName2("è2");
		System.out.println(c.name);
		
		c.setName3("è3");
		System.out.println(c.name);
	}
    
}
