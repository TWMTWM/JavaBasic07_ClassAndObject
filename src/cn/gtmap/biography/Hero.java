package cn.gtmap.biography;

/**
 * 基本类型传参
 * 	在方法内，无法修改方法外的基本类型参数
 * @author Administrator
 *
 */
public class Hero {
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
     
    public Hero(){
         
    }
	
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    
    public void huixue(int xp){
    	hp =hp + xp;
    	//回血完毕后，血瓶=0
    	xp = 0;
    }
    
	public static void main(String[] args) {
		Hero teemo = new Hero("提莫",383f);
		int xueping = 100;
		teemo.huixue(xueping);
		System.out.println(xueping);
	}
}
