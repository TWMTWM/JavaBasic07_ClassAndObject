package cn.gtmap.singleton;

/**
 * ����ʽ����ģʽ
 * ����ʽ����ģʽ�����ʽ����ģʽ��ͬ��ֻ���ڵ���getInstance��ʱ�򣬲Żᴴ��ʵ��
 * @author Administrator
 *
 */
public class GiantBigDragon {
	
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private GiantBigDragon(){
		
	}
	
	//׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
	private static GiantBigDragon instance;
	
	//public static ����������ʵ������
	public static GiantBigDragon getInstance(){
		//��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
		if(null==instance){
			instance = new GiantBigDragon();
		}
		//���� instanceָ��Ķ���
		return instance;
	}
}
