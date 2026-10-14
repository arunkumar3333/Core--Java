package MultiThreading;
class user implements Runnable{
    String name;
    int age;
    user(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public void run() {
        System.out.println("User Info:- Name:-"+name+"  Age:-"+age);
    }
}
class Theater implements Runnable{
    String tname;
    String address;
    Theater(String n, String a){
        this.tname=n;
        this.address=a;
    }
    @Override
    public void run() {
        System.out.println("Theater Name:- "+tname+"\t Address:- "+address);
    }
}
class Movie implements Runnable{
    String movieName;
    double price;
    Movie(String mn, double pr){
        this.movieName=mn;
        this.price=pr;
    }
    @Override
    public void run() {
        System.out.println("Movie Name:- "+movieName+"\t Ticket Price:-> "+price);
    }
}
public class MovieTicket {
    public static void main(String[] args) {
    user user=new user("Raj",24);
    Theater theater=new Theater("Raj Murali","Hebbal");
    Movie movie=new Movie("Premada oorali",350.25);
    Thread u=new Thread(user);
    Thread tr=new Thread(theater);
    Thread mv=new Thread(movie);
    u.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
    mv.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
    tr.start();
    }
}
