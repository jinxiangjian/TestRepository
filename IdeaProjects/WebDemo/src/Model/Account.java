package Model;

public class Account {
    private String accountNo;
    private double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //提供一个线程安全的draw()方法来完成取钱操作  同步方法
    public synchronized void draw(double drawAmount){
        if(balance>=drawAmount){
            System.out.println(Thread.currentThread().getName()+"取钱成功！吐出钞票："+drawAmount);
            try{
                Thread.sleep(1);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            balance-=drawAmount;
            System.out.println("\t余额为："+balance);
        }else{
            System.out.println(Thread.currentThread().getName()+"取钱失败，余额不足");
        }
    }
}
