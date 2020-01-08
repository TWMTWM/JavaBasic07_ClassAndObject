package cn.gtmap.enumeration;

/**
 * 测试枚举类型
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Season season = Season.SPRING;
		switch(season){
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.err.println("冬天");
			break;
		}
	}

}
