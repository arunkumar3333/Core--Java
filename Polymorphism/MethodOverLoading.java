package Polymorphism;
class Over{
    void add(int a,int b){
        System.out.println("Addition of Two Numbers is: "+(a+b));
    }
    void add(int a,int b, int c){
        System.out.println("Addition of 3 numbers: "+(a+b+c));
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Over obj=new Over();
        obj.add(2,6);
        obj.add(5,10,15);
    }
}
