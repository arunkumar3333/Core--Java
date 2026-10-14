package MultiThreading;
class BankAccount{
    double balance;
    String account;
    BankAccount(String acc,double balance){
        this.account=acc;
        this.balance=balance;
    }
    synchronized void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance!");
        } else if (balance-amount<500) {
            System.out.println("Minimum balance of ₹500 must be maintained.");
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Available balance is: "+balance);
        }
        else{
           balance-=amount;
            System.out.println("your transaction is processing.....");
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Rs: "+amount+" withdraw successful ");
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Available balance is: "+balance);
        }
    }
}
class MyThread extends Thread{
    BankAccount account;
    double withdrawAmount;
    MyThread(BankAccount acc, double amt){
        this.account=acc;
        this.withdrawAmount=amt;
    }
    @Override
    public void run() {
        account.withdraw(withdrawAmount);
    }
}
public class SynchronizationThread {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("account",1000.0);
        MyThread t1=new MyThread(bankAccount,600);
        MyThread t2=new MyThread(bankAccount,353);
        t1.start();
        t2.start();
    }
}
