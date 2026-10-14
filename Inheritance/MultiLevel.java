package Inheritance;
class Animal{
    String Type;
    String Color;

    Animal(String t,String c){
        this.Color=c;
        this.Type=t;
    }

    void ShowDetails(){
        System.out.println("Animal Details Are...");
        System.out.println("Type: "+Type+"\n"+"Color: "+Color);
    }
}

class Cow extends Animal{
    String Breed;
    Cow(String type,String c,String br){
        super(type,c);
        this.Breed=br;
    }

    void display(){
        super.ShowDetails();
        System.out.println("Breed: "+Breed);
    }
}

class Calf extends Cow{
    String gender;
    int age;
    Calf(String g, int a,String t,String c, String b){
        super(t,c,b);
        this.gender=g;
        this.age=a;
    }
    void show(){
        super.display();
        System.out.println("Calf Details are...");
        System.out.println("Gengder: "+gender+"\n"+"Age: "+age);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
    Calf lakshmi=new Calf("Female",5,"Herbivorous","White and Black","Jersy");
    lakshmi.show();
    }
}
