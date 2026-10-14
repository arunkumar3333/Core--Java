package Methods;

class java{
    public void greet(){
        System.out.println("Hello Arun");
    }
}
class addition{
    public void add(int a, int b){
        System.out.println("Addition of numbers is: "+(a+b));
    }
}
public class methods {
    public static void main(String[] args) {
        java gr=new java();
        addition sum=new addition();
        gr.greet();
        sum.add(5,59);
    }
}
