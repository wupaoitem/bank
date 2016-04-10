import java.util.Scanner;

/**
 * Created by Administrator on 2016/4/8.
 */
public class bank {
   // private String name;
    private int countName;
    private int password;
    private savetest [] s = new savetest[100];
    private int flag=0;
    //    private  double money;

    //计数器累加
    public void Flagsum() {
        flag++;
    }

    //初始化
    public void newsavelist(){
        s[flag] = new savetest( 0, 0 , 0, 1);
    }

    //注第一笔存款存在flag=1处，flag=0处为一个判断是否有存款的标志位
    public bank(int countName, int password/*, double money String name*/){
      //  this.name = name;
        this.countName = countName;
        this.password = password;
        newsavelist();
//        this.money = money;
    }

    //显示存款
    public void showsaveif(){
        if(flag!=0){
            System.out.println("您的存款条目如下");
            for(int i = 1 ; i <flag+1 ; i ++){
                System.out.println(i+".");
                s[i].showbankif();
            }
            System.out.println();
        }
        else {
            System.out.println("您还没有存款！");
        }
    }

    //存款
    public void save(){
        newsavelist();
        double m=0;
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入存款类型！（1为活期，2为定期）");
        a = scan.nextInt();
        s[flag].setBanksort(a);
        if(a==2){
            System.out.println("请输入存款期限！（输入存几天）");
            a = scan.nextInt();
            s[flag].setSavetime(a);
        }
        System.out.println("请输入存款金额！");
        m = scan.nextInt();
        s[flag].setMoney(s[flag].getMoney()+m);
        System.out.println("请输入存款时间！（输入第几天）");
        a = scan.nextInt();
        s[flag].setSavedate(a);
        System.out.println("成功存入"+m+"元！");
    }

    //取款
    public void get(){
        Scanner scan = new Scanner(System.in);
        int n;
        showsaveif();
        if(flag!=0){
            System.out.println("请选择您要取出的存款编号:");
            n = scan.nextInt();
            System.out.println("取款成功！");
        }
        else{
            System.out.println("取款失败！");
        }
    }

    //收益计算(穿入参数s:第几笔存款，opt取款时间
    public void count(int s ,int opt){
        
    }

    // public void setMoney(double money) {
//        this.money = money;
//    }

    //   public double getMoney() {
//        return money;
//    }


    public int getFlag() {
        return flag;
    }

    public int getCountName() {
        return countName;
    }

//    public String getName() {
//      return name;
//    }

    public int getPassword() {
        return password;
    }

    public void setCountName(int countName) {
        this.countName = countName;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setPassword(int password) {
        this.password = password;
    }

}
