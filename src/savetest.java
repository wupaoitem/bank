/**
 * Created by Administrator on 2016/4/10.
 */
public class savetest {
    private int banksort ;//储存存款类型，1为活期，2为定期，默认为活期。
    private double money;//这笔存款金额
    private int savetime=0;//存款期限默认为0，若为定期则设置
    private int savedate;//存款时间

    public savetest(int b, double m, int st,int sd) {
        this.savetime=st;
        this.banksort=b;
        this.savedate=sd;
        this.money=m;
    }

    //显示单笔存款信息
    public void showbankif(){
        if(banksort==1){
            System.out.println("存款金额："+money+"     存款类型：活期"+"     存款时间：第"+savedate+"天");
        }
        else {
            System.out.println("存款金额："+money+"     存款类型：定期"+"     存款时间：第"+savedate+"天"+"     存款期限"+savetime+"天");
        }

    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getBanksort() {
        return banksort;
    }

    public double getMoney() {
        return money;
    }

    public int getSavedate() {
        return savedate;
    }

    public int getSavetime() {
        return savetime;
    }

    public void setBanksort(int banksort) {
        this.banksort = banksort;
    }

    public void setSavedate(int savedate) {
        this.savedate = savedate;
    }

    public void setSavetime(int savetime) {
        this.savetime = savetime;
    }

}
