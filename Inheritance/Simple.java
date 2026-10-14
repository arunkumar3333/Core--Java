package Inheritance;
class Parent{
    void dog(){
        System.out.println("Dog is barking");
    }
}
class Child extends Parent{
    void puppy(){
        System.out.println("Puppy is so Sweet");
    }
}
public class Simple {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.dog();//only can access parent class


        Child obj=new Child();// using child class object we can access both parent and child class
        obj.puppy();
        obj.dog();
    }
}
