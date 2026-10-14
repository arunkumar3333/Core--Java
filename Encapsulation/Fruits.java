package Encapsulation;
class Hannu{
    private String name;
    private int price;

    public void setName(String n){
        this.name=n;
    }
    public void setPrice(int p){
        this.price=p;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
}
public class Fruits {
    public static void main(String[] args) {
    Hannu fruit=new Hannu();
    fruit.setName("Pomegranate");
    fruit.setPrice(250);
    System.out.println(fruit.getName());
    System.out.println(fruit.getPrice()+" rs");
    }
}
