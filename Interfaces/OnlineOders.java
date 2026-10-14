package Interfaces;
interface Zepto{
    void delivery(String productName, double price);
}
interface InstaMart{
    void order(String productName, double price);
}

class Confirmation implements Zepto, InstaMart{
    @Override
    public void delivery(String productName, double price) {
        System.out.println("From Zepto Order Details: \n"+"Product Name: "+productName+"\n"+"Price: "+price);
    }

    @Override
    public void order(String productName, double price) {
        System.out.println("From instaMart Order Details: \n"+"Product Name: "+productName+"\n"+"Price: "+price);
    }
}
public class OnlineOders {
    public static void main(String[] args) {
    Confirmation zepto=new Confirmation();
    Confirmation instamart=new Confirmation();
    zepto.delivery("Mouse",250.0);
    instamart.order("oppoK13",22500);
    }
}
