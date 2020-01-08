package cn.gtmap.inherit;
/**
 * 武器类继承物品类
 * @author Administrator
 *
 */
public class Weapon extends Item {
	int damage;//攻击力
	public static void main(String[] args) {
		Weapon infinityEdge =new Weapon();
		infinityEdge.damage = 65;
		infinityEdge.name = "无尽之刃";//name属性，是从Item中继承来的，就不需要重复设计了
		infinityEdge.price = 3600;
	}
}
