package cn.gtmap.enumeration;

/**
 * ����ö������
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Season season = Season.SPRING;
		switch(season){
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUMN:
			System.out.println("����");
			break;
		case WINTER:
			System.err.println("����");
			break;
		}
	}

}
