package MultiThreading;
class customer extends Thread{
    String cName;
    String cAddress;
    customer(String name, String address){
        this.cName=name;
        this.cAddress=address;
    }
    public void run(){
        System.out.println("Your order is Confirmed, Customer Name: "+cName+" adrress: "+cAddress);
        try{
           Thread.sleep(9000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class order extends Thread{
    String id;
    String itemName;
    double price;
    order(String id, String itemname, double price){
        this.id=id;
        this.itemName=itemname;
        this.price=price;
    }
    public void run(){
        System.out.println("Your id is "+id+" for the item "+itemName+" and price is "+price);
        try{
            Thread.sleep(9000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class deliveryPartner extends Thread{
    String dpName;
    long mobileNumber;
    deliveryPartner(String name, long mobile){
        this.dpName=name;
        this.mobileNumber=mobile;
    }
    public void run(){
        System.out.println("Delivery person Name: "+dpName+", Mobile number: "+mobileNumber);
        try{
            Thread.sleep(9000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Swiggy {
    public static void main(String[] args) {
    customer cust=new customer("Arun","Tirumanahalli");
    customer cust2=new customer("Anush K","Iragappanahalli Sadali");
    cust.start();
    cust2.start();

    deliveryPartner delivery=new deliveryPartner("Anush K",7411277145L);
    deliveryPartner delivery2=new deliveryPartner("Arun Kumar Arun",8431396133L);
    delivery.start();
    delivery2.start();

    order order=new order("KA07","Mango",250.25);
    order order2=new order("KA08","Apple",550.25);
    order.start();
    order2.start();
    }
}
