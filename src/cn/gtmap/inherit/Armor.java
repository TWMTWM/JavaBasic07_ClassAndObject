package cn.gtmap.inherit;

/**
 * ������̳���Ʒ��
 * @author Administrator
 *
 */
public class Armor extends Item {
	int ac;//���׵ȼ�

	public static void main(String[] args) {
		Armor cloth = new Armor();
		cloth.ac = 1;
		cloth.name = "����";
		cloth.price = 300;
		Armor hauberk = new Armor();
		hauberk.ac = 2;
		hauberk.name = "���Ӽ�";
		hauberk.price =750;
	}
}
