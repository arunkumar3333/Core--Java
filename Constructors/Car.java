package Constructors;
class Mahindra{
    String name;
    String color;
    String RegNo;
    Mahindra(String name,String color,String RegNo){
        this.name=name;
        this.color=color;
        this.RegNo=RegNo;
        System.out.println("Car Details are...");
        System.out.println("Name: "+name+"\n"+"Color: "+color+"\n"+"RegNo: "+RegNo);
        System.out.println();
    }
//    void display(){
//        System.out.println("Car Details are...");
//        System.out.println("Name: "+name+"\n"+"Color: "+color+"\n"+"RegNo: "+RegNo);
//    }
}
public class Car {
    public static void main(String[] args) {
        Mahindra mahi=new Mahindra("Mahindra SUV700","White","KA07Y8983");
        Mahindra mahi2=new Mahindra("Mahindra SUV3X0","Black","KA51ES2752");
        //mahi.display();
    }
}
