package cn.gtmap.enumeration;

/**
 * 遍历枚举
 * 	借助增强型for循环，可以很方便的遍历一个枚举都有哪些常量
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		for (Season s : Season.values()) {
			System.out.println(s);
		}
	}
}
