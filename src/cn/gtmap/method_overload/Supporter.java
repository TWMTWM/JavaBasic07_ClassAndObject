package cn.gtmap.method_overload;

/**
 * 练习：方法重载
 * @author Administrator
 *
 */
public class Supporter extends Hero{
	public void heal(){
		System.out.println(name + "对一个英雄进行治疗，但不知道治疗了谁" );
	}
	
	public void heal(Hero h1){
		System.out.println(name + "对" + h1.name + "进行了一次治疗 ");
	}
	
	public void heal(Hero h1,int hp){
		System.out.println(name + "同时对" + h1.name + "治疗了" + hp + "血量");
	}
	
	public static void main(String[] args) {
		Supporter supporter = new Supporter();
		supporter.name = "索拉卡";
		Hero h1 = new Hero();
		h1.name = "盖伦";
		supporter.heal();
		supporter.heal(h1);
		supporter.heal(h1, 30);
	}
	
}
