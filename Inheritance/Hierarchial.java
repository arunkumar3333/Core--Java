package Inheritance;
class Cars{
    String color;
    double price;

    Cars(String c, double p){
        this.color=c;
        this.price=p;
    }
    void one(){
        System.out.println("The Car Details are..........\n"+"Color: "+color+"\n"+"Price: "+price);
    }
}
class BMW extends Cars{
    String type;
    BMW(String type,String color,double price){
        super(color,price);
        this.type=type;
    }
    void Two(){
        super.one();
        System.out.println("BMW Cars are driver luxury!");
        System.out.println("Type: "+type);
    }
}
class Audi extends Cars{
    String variant;
    Audi(String v,String color,double price){
        super(color,price);
        this.variant=v;
    }
    void three(){
        super.one();
        System.out.println("Audi cars are Amazing to drive.");
        System.out.println("Variant: "+variant);
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        BMW child1=new BMW("AWD","Blue",2500000);
        Audi Child2=new Audi("FWD","Green",3000000);
        child1.Two();
        child1.one();
        System.out.println();
        Child2.three();
        Child2.one();
    }
}
