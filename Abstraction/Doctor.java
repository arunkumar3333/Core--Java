package Abstraction;
abstract class Specializatio{
    String name;
    int age;
    Specializatio(String n, int a){
        this.age=a;
        this.name=n;
    }
    abstract void cardiologist();
    abstract void dentist(String name,int age);
}

class type extends Specializatio{
//    String name;
//    int age;
   type(String name,int age){
       super(name,age);

   }
    void cardiologist() {
        System.out.println("Cardio Doctor Details are....\n"+"Name: "+name+"\n"+"Age: "+age);
    }

    void dentist(String name, int age) {
        System.out.println("Dental Doctor Details are...\n"+"Name: "+name+"\n"+"Age: "+age);
    }
}
public class Doctor {
    public static void main(String[] args) {
    type cardio=new type("Raj",24);
    cardio.cardiologist();
    cardio.dentist("Arun",23);
    cardio.dentist("Deepika",22);
    }
}
