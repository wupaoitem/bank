/**
 * Created by Administrator on 2016/4/8.
 */
import java.util.Scanner;

public class mainbank {

    public static void mainwindow() {
        System.out.println("**************欢迎使用简易银行系统**************");
        System.out.println("*                                              *");
        System.out.println("*     输入功能菜单： 1：注册                   *");
        System.out.println("*                    2：登录                   *");
        System.out.println("*                    3: 查看功能介绍           *");
        System.out.println("*                    4: 退出                   *");
        System.out.println("* PS：最好先查看下介绍里面有一些默认的参数设定 *");
        System.out.println("*                                              *");
        System.out.println("*          请继续输入指令来运行程序！          *");
        System.out.println("************************************************");
        bankmangement bm = new bankmangement();
        Scanner scan = new Scanner(System.in);
        int a;//用户输入的标识符
//		int as=0;//用于储存登录成功后用户信息的位置(V.01)
        for (int i = 0; i < 100; i++) {
            a = scan.nextInt();
            switch (a) {
                case 1:/*m.showFlag();*/
                    ;
                    bm.regist();
                    bm.Flagssum();
                    break;
                case 2:/*mu.regist();mu.Flagsum()*/
                    bm.signin();
                    break;
                case 3:
                    justsoso();
                    break;
                case 4:
                    break;
            }
            if (a == 4) {
                System.out.println("********************感谢使用********************");
                System.out.println("                                   版本号：V.002");
                System.out.println("                                   作者：童天航 ");
                System.out.println("                                   QQ：530417595");
                break;
            }
        }
    }

    public static void justsoso() {
        System.out.println("由于版本过低大部分功能尚未完善，现在只有存取款，计算收益等简单功能！");
        System.out.println("为了方便运行和设定默认存款日期为第0天，收益的话活期利率为1%/天，定期利率为5%/天");
        System.out.println("所有收益的时间单位都是天！在输入取款时间的时候请输入取款的天数！");
        System.out.println("更多功能敬请期待！");
        System.out.println("请输入“1”来注册一个新账户  或者“2”来登录  或者“3”来查看功能介绍 或者“4”退出该程序！");
    }

    public static void main(String[] args) {
        mainwindow();
    }
}
