package cn.gtmap.singleton;

/**
 * ��������ʽ����ģʽ
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		//ͨ��newʵ�����ᱨ��
		//GiantBigDragon g = new GiantBigDragon();
		//ֻ��ͨ��getInstance�õ�����
		GiantBigDragon g1 = GiantBigDragon.getInstance();
		GiantBigDragon g2 = GiantBigDragon.getInstance();
		GiantBigDragon g3 = GiantBigDragon.getInstance();
		
		//����ͬһ������
		System.out.println(g1==g2);
		System.out.println(g2==g3);
	}

}
