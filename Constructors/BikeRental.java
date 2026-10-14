package Constructors;
class Bike{
    String name;
    String proof;
    int days;
    double price_perday;
    double rent;
    Bike(String n,String p,int d,double price){
        this.name=n;
        this.proof=p;
        this.days=d;
        this.price_perday=price;
    }
    void show(){
        System.out.println("Customer Details are.....");
        System.out.println("Name: "+name+"\n"+"Proof: "+proof+"\n"+"Number Of Days: "+days+"\n"+"Price per day: "+price_perday);
    }
    void rentAmount(){
        rent=days*price_perday;
        if(days>=5){
            rent=rent-(rent*0.1);
            System.out.println("Total rent for "+days+" days After Discount is: "+rent+"/Rs");
            System.out.println();
        }else{
            System.out.println("Total rent for "+days+" days is: "+rent+"/Rs");
            System.out.println("You are not eligible to get discount. If want, book atleast for 5 days ");
            System.out.println();
        }

    }
}
public class BikeRental {
    public static void main(String[] args) {
    Bike cust=new Bike("Arun","Aadhar",2,350);
    Bike cust2=new Bike("Raj","Pan",12,300);
    cust.show();
    cust.rentAmount();

    cust2.show();
    cust2.rentAmount();
    }
}
