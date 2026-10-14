package Abstraction;
abstract class vehicle{
        abstract void start(String name, double price);

}
class car extends vehicle{
    void start(String n,double p){
        System.out.println("Car Info: \n Name: "+n+"\n"+"Price: "+p);
    }
}
class MotorCycle extends vehicle{
    void start(String name,double price){
        System.out.println("Bike Info: \n Name: "+name+"\n"+"Price: "+price);

    }
}
public class Motors {
    public static void main(String[] args) {
        car c=new car();
        c.start("TATA Nexon",350000);
        c.start("XPulse210V",230000);
    }
}
