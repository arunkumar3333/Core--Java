package Interfaces;
interface Vehicle{
    void features(String model, int seater,String fuel_type);
}
class Car implements Vehicle{
    @Override
    public void features(String model, int seater, String fuel_type) {
        System.out.println("Car Info:  "+"Name: "+model+"  No of Seats: "+seater+"   Fuel Type: "+fuel_type);
    }
}
class ElectricVehicle implements Vehicle{
    @Override
    public void features(String m, int seater, String fuel_type) {
        System.out.println("Electric Car Info:  "+"Name: "+m+"  No of Seats: "+seater+"   Fuel Type: "+fuel_type);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Car car=new Car();
        car.features("Mahindra 3X00",7,"Petrol");
        ElectricVehicle electricVehicle=new ElectricVehicle();
        electricVehicle.features("TATA Nexon",5,"Electricity");
    }
}
