package Encapsulation;
class Product{
    private String name="Apple";
    private int price=200;

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
public class Encap {
    public static void main(String[] args) {
        Product p=new Product();
        System.out.println(p.getName());
        System.out.println(p.getPrice()+" Rs");
    }
}
