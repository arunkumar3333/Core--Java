package Interfaces;
interface Animal{

    void sound();//by default abstract in nature
    static void fly(){
        System.out.println("Flying");
    }
    default void move(){
        System.out.println("Moving");
    }
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("HLO");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Dog g=new Dog();
        g.sound();
        g.move();// default method call need object
        Animal.fly();//static method call
    }
}
