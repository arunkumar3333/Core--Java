package Opps;

import java.util.Scanner;
import java.util.SortedMap;

class Product{
    String name="Papaya";
    int quantity=5;
    double price=59.9;
    double total_price;
    double discount;
    void display(){
        System.out.println("Product Details are: \n"+"Name: "+name+"\n"+"Quantity: "+quantity+" \n"+"Price"+price);
    }
    void show(int q, String name, double p){
        System.out.println(name+"\n"+q+"\n"+p);
    }
    void total(){
        total_price=quantity*price;
        System.out.println("Total Price of Purchase: "+total_price);
    }

    void discount(){
        if(total_price>=999){
            System.out.println("35 %  discount");
           discount= total_price*0.35;
           total_price-=discount;
            System.out.println("Total price After the Discount is: "+total_price);
        }else{
            discount=total_price*0.25;
            total_price-=discount;
            System.out.println("Total price After the Discount is: "+total_price);
        }
    }
}
public class Zepto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Product p1=new Product();
        p1.display();
       // p1.show(6,"Apple",78.90);
        p1.total();
        p1.discount();
    }
}
