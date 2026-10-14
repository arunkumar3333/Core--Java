package Interfaces;
interface Parents{      //parent class 1
    void details();
}
interface GrandParent{      //parent class 2
    void info();
}
class Son implements Parents,GrandParent{        //multiple inheritance
    @Override
    public void details() {
        System.out.println("Parent Behaviours");
    }
    @Override
    public void info() {
        System.out.println("Grand Parent Features");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Son son=new Son();
        son.details();
        son.info();
    }
}
