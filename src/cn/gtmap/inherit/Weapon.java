package cn.gtmap.inherit;
/**
 * ������̳���Ʒ��
 * @author Administrator
 *
 */
public class Weapon extends Item {
	int damage;//������
	public static void main(String[] args) {
		Weapon infinityEdge =new Weapon();
		infinityEdge.damage = 65;
		infinityEdge.name = "�޾�֮��";//name���ԣ��Ǵ�Item�м̳����ģ��Ͳ���Ҫ�ظ������
		infinityEdge.price = 3600;
	}
}