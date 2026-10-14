package Constructors;
class Bus{
    String Cname;
    String gender;
    String source;
    String destination;
    //double price;
    String date;
    double cost;
    double price_km;
    int km;

    Bus(String n,String g,String s,String ds,int k,double pk, String d){
       this.Cname=n;
       this.gender=g;
       this.source=s;
       this.price_km=pk;
       this.destination=ds;
       this.km=k;
       this.date=d;
    }

    void display(){
        System.out.println("Customer Details are:");
        System.out.print("Name: "+Cname+"\n"+"Gender: "+gender+"\n"+"Source-Destination: "+source+
                "-"+destination+"\n"+"Kilometers: "+km+"\n"+"Price Per Kilometer:"+price_km+"\n"+"Date: "+date);
        System.out.println();
    }
    void offer(){
        cost=km*1.5;
        if(km>750){
            cost=cost-(cost*0.15);
            System.out.println("You got 15% discount, Enjoy the trip!");
            System.out.println("Cost For the Trip is: "+cost);
        }else{
            System.out.println("Cost For the Trip is: "+cost);
        }
    }
}
public class BusBooking {
    public static void main(String[] args) {
    Bus raj=new Bus("Raj","Male","Tin Factory","Mulbagal",800,1.5,"24-09-2026");
    raj.display();
    raj.offer();
    }
}
