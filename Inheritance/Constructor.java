package Inheritance;
class Vehicle {
    String fuel_type;
    int no_seats;

    Vehicle(String f, int nos) {
        this.fuel_type = f;
        this.no_seats = nos;
    }

    void showDetails() {
        System.out.println("Vehicle Details are..,\n" + "Fuel Type: " + fuel_type + "\n" + "No of Seats: " + no_seats);
        System.out.println();
    }
}
    class Car extends Vehicle{
        String model;
        String color;
        double price;

        Car(String m,String c,double p,int  n,String f){
            super(f,n);
            this.model=m;
            this.color=c;
            this.price=p;
        }

        void display(){
            System.out.println("Car Details are..,\n"+"Fuel Type: "+fuel_type+"\n"+"No of Seats: "+no_seats+"\n"+"Model: "+model+"\n"+"Color: "+color+"\n"+"Price: "+price);
        }
    }

public class Constructor {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Diesel",5);
        v1.showDetails();
        Car c1=new Car("Mahindra 3XOO","Red",40000.0,7,"Petrol");
        c1.display();
    }
}
