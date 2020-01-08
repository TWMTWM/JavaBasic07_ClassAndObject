package cn.gtmap.singleton;

/**
 * 测试懒汉式单例模式
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		//通过new实例化会报错
		//GiantBigDragon g = new GiantBigDragon();
		//只能通过getInstance得到对象
		GiantBigDragon g1 = GiantBigDragon.getInstance();
		GiantBigDragon g2 = GiantBigDragon.getInstance();
		GiantBigDragon g3 = GiantBigDragon.getInstance();
		
		//都是同一个对象
		System.out.println(g1==g2);
		System.out.println(g2==g3);
	}

}
