package Abstraction;

import com.sun.source.tree.BreakTree;

abstract class employee{
    String name;
    double bonus;
    int no_years;
    employee(String n,int noy,double b){
        this.name=n;
        this.bonus=b;
        this.no_years=noy;
    }
    abstract void calculateBonus();
}
class Worker extends employee{
    Worker(String n,double b, int noy){
        super(n,noy,b);
    }
    public void calculateBonus(){
        if(no_years>=5){
            System.out.println("Employee Info...\n"+"Name: "+name+"\n"+"Number Years: "+no_years+"\n"+"Bonus: "+(bonus*1.5));
        }else{
            System.out.println("Employee Info...\n"+"Name: "+name+"\n"+"Number Years: "+no_years+"\n"+"Bonus: "+(bonus*1.2));
        }
    }
}
public class Company {
    public static void main(String[] args) {
        Worker emp=new Worker("Arun",25000.0,4);
        emp.calculateBonus();
    }
}
