package cn.gtmap.this_method;

/**
 * this����ǰ����
 * @author Administrator
 *
 */
public class Hero {
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
    
    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "����";
        //ֱ�Ӵ�ӡ���󣬻���ʾ�ö������ڴ��е������ַ
        //��ʽ��Hero@c17164 c17164�������ַ��ÿ��ִ�У��õ��ĵ�ַ��һ��һ��
 
        System.out.println("��ӡ���󿴵��������ַ��"+garen);
        //����showAddressInMemory����ӡ�ö����this����ʾ��ͬ�������ַ
        garen.showAddressInMemory();
         
        Hero teemo =  new Hero();
        teemo.name = "��Ī";
        System.out.println("��ӡ���󿴵��������ַ��"+teemo);
        teemo.showAddressInMemory();
		
	}

	private void showAddressInMemory() {
		System.out.println("��ӡthis�����������ַ��"+this);		
	}
	
}
