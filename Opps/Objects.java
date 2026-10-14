package Opps;

class Person{
    String name="Arun Kumar V";
    int age=23;
}
class Doggy{
    String name="Bhairava";
    int age=6;
    String skills="Barking";
}
public class Objects {
    public static void main(String[] args) {
        Person p1=new Person();
        Doggy dog=new Doggy();
        System.out.println("The person name is: "+p1.name);
        System.out.println("Age is: "+p1.age);
        System.out.println();
        System.out.println("Dog Details are........ ");
        System.out.println("Dog Name: "+dog.name);
        System.out.println("Dog Age : "+dog.age);
        System.out.println("Dog Skills: "+dog.skills);
    }
}
