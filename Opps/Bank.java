package Opps;

import java.util.Scanner;

class ATM{
    double balance=1000.0;
    void deposit(double amt){
        balance+=amt;
        System.out.println(amt+" is credited to your Account");
        System.out.println("Available Balance is: "+balance);
    }
    void withdraw(double wt){
        if(wt>balance){
            System.out.println("Insufficient Balance!");
        }else{
            balance-=wt;
            System.out.println("Withdrawed Amount is:"+wt);
            System.out.println("Available Balance is: "+balance);
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount to Deposit: ");
        double dep=sc.nextDouble();
        ATM person=new ATM();
        person.deposit(dep);
        person.withdraw(250);
    }
}
