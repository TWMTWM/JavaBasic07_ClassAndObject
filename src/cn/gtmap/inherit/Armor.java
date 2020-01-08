package cn.gtmap.inherit;

/**
 * 护甲类继承物品类
 * @author Administrator
 *
 */
public class Armor extends Item {
	int ac;//护甲等级

	public static void main(String[] args) {
		Armor cloth = new Armor();
		cloth.ac = 1;
		cloth.name = "布甲";
		cloth.price = 300;
		Armor hauberk = new Armor();
		hauberk.ac = 2;
		hauberk.name = "锁子甲";
		hauberk.price =750;
	}
}
