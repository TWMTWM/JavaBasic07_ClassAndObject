package cn.gtmap.singleton;

/**
 * 测试饿汉式单例模式
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		//通过new实例化会报错
		//GiantDragon g = new GiantDragon();
		
		//只能通过getInstance得到对象
		
		GiantDragon g1 = GiantDragon.getInstance();
		GiantDragon g2 = GiantDragon.getInstance();
		GiantDragon g3 = GiantDragon.getInstance();
		
		System.out.println(g1==g2);//true
		System.out.println(g1==g3);//true
	}

}
