import java.util.Scanner;

/**
 * Created by Administrator on 2016/4/8.
 */
public class bankmangement {
    private bank [] b = new bank[100];
    private int newcountname=100000;
    private int flags=0;
//    private int way = 1;//储存存款类型，1为活期，2为定期，默认为活期。

    //初始化
    public void newbank(){
        b[flags] = new bank( 0,  0  );
    }

    //计数器累加
    public void Flagssum() {
        flags++;
    }

    //自动生成账号
    public void setNewcountname() {
        b[flags].setCountName(newcountname+flags);
    }

    public int getNewcountname() {
        return newcountname;
    }

    public int getFlags() {
        return flags;
    }

    //显示所有已存在用户名
    public void showcn(){
        for(int i = 0 ; i < flags ; i++){
            System.out.println(i+".    "+b[i].getCountName());
        }
    }

    //查询余额
    public void lookbank(int n){
        b[n].showsaveif();
    }

    //存款
    public void savemoney(int n){
        b[n].Flagsum();
        b[n].save();
    }

    //取款
    public void getmoney(int n){
        b[n].get();
    }

    //注册
    public void regist(){
        newbank();
        Scanner scan = new Scanner(System.in);
        int sn = 0;
        setNewcountname();
        System.out.println("您的新账户名为："+b[flags].getCountName());
        System.out.println("请输入6位数字组成的密码 ：");
        sn = scan.nextInt();
        b[flags].setPassword(sn);
        System.out.println("注册成功！");
        System.out.println("请输入“1”来注册一个新账户  或者“2”来登录  或者“3”来查看功能介绍 或者“4”退出该程序！");
    }

    //登录
    public void signin(){
        showcn();
        System.out.println("请输入您要登录的账户编号!");
        Scanner scan = new Scanner(System.in);
        int n =0;
        n = scan.nextInt();
        if(n >= 0 && n<=getFlags() ){
            System.out.println("请输入密码！");
            int m = 0;
            m = scan.nextInt();
            if(m==b[n].getPassword()){
                System.out.println("登录成功！");
                signWindows(n);
            }
            else{
                int k=1;
                while(k!=0){
                    System.out.println("密码错误！请重新输入密码：或者输入“0”来取消登录");
                    m = scan.nextInt();
                    if(m==0){
                        System.out.println("请输入“1”来注册一个新账户  或者“2”来登录  或者“3”来查看功能介绍 或者“4”退出该程序！");
                        break;
                    }
                    if(b[n].getPassword()==m){
                        k=0;
                        System.out.println("登录成功！");
                        signWindows(n);
                    }
                }
            }
        }
        else {
            System.out.println("您要登录的账户不存在！");
            System.out.println("请输入“1”来注册一个新账户  或者“2”来登录  或者“3”来查看功能介绍 或者“4”退出该程序！");
        }

    }

    //登录界面
     public void signWindows(int n) {
         System.out.println("********************欢迎登录********************");
         System.out.println("亲爱的用户：您好！");
         System.out.println("输入“1”显示余额，输入“2”存款!");
         System.out.println("输入“3”取款，输入“4”可以退出登录！");
         Scanner scan = new Scanner(System.in);
         for(int i = 0;i < 100;i++){
             int m;
             m = scan.nextInt();
             switch(m){
                 case 1:lookbank(n);break;
                 case 2:savemoney(n);break;
                 case 3:getmoney(n);break;
                 case 4:break;
             }
             if(m==4){
                 System.out.println("注销成功！欢迎下次使用！");
                 System.out.println();
                 System.out.println("请输入“1”来注册一个新账户  或者“2”来登录  或者“3”来查看功能介绍 或者“4”退出该程序！");
                 break;
             }
             System.out.println("输入“1”显示余额，输入“2”存款!");
             System.out.println("输入“3”取款，输入“4”可以退出登录！");
         }
     }
}



