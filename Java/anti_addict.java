import java.io.*;
import java.lang.*;
import java.util.*;
 
public class anti_addict{
	static String s00="为了积极响应国家新闻出版署印发的《关于进一步严格管理 切实防止未成年人沉迷网络游戏的通知》，守护未成年人的成长环境，引导未成年人享受健康游戏生活，《Java》未成年人防沉迷系统将于2021年08月31日0点进行调整。\n根据相关通知的要求：\n调整后，《Java》游戏仅会在周五、周六、周日和法定节假日的20时至21时，向未成年人提供1小时游戏服务。\n此外，《Java》游戏不会以任何形式向未实名注册和登录的用户提供游戏服务。\n关于未成年人防沉迷系统进行相应调整后可能带来的游戏体验变化，我们将尽快在后续提供处理说明，请大家关注官方公告。\n感谢各位玩家的支持和理解。\n";
	static String s01="     ____.                    \n    |    |____ ___  _______   \n    |    \\__  \\\\  \\/ /\\__  \\  \n/\\__|    |/ __ \\\\   /  / __ \\_\n\\________(____  /\\_/  (____  /\n              \\/           \\/ \n    抵制不良游戏，拒绝盗版游戏。\n    注意自我保护，谨防受骗上当。\n    适度游戏益脑，沉迷游戏伤身。\n    合理安排时间，享受健康生活。\n";
	static String s10="为了积极响应国家新闻出版署没有印发的《关于进一步严格管理 切实防止未成年人沉迷编程的通知》，守护未成年人的成长环境，引导未成年人享受健康编程生活，《Java》未成年人防沉迷系统将于1970年01月01日0点进行调整。\n根据相关通知的要求：\n调整后，《Java》仅会在周五、周六、周日和法定节假日的20时至21时，向未成年人提供1小时编程服务。\n此外，《Java》不会以任何形式向未实名注册和登录的用户提供编程服务。\n关于未成年人防沉迷系统进行相应调整后可能带来的编程体验变化，我们将尽快在后续提供处理说明，请大家关注官方公告。\n感谢各位程序员的支持和理解。\n";
	static String s11="     ____.                    \n    |    |____ ___  _______   \n    |    \\__  \\\\  \\/ /\\__  \\  \n/\\__|    |/ __ \\\\   /  / __ \\_\n\\________(____  /\\_/  (____  /\n              \\/           \\/ \n    抵制不良缩进，拒绝乱用继承。\n    注意自我保护，谨防受骗上当。\n    适度编程益脑，沉迷编程伤身。\n    合理安排时间，享受秃头生活。\n";	
	static boolean f(){
		Calendar cal=Calendar.getInstance();
		int h=cal.get(Calendar.HOUR_OF_DAY);
		int s=cal.get(Calendar.DAY_OF_WEEK);
		return (h==20)&&(s==1||s==6||s==7);
	}
    public static void main(String[] args){
		if(f()){
			System.out.println(s11);
		}else{
			System.out.println(s10);
			Scanner cin=new Scanner(System.in);
			String c=cin.next();
			System.exit(0);
		}
	}
}