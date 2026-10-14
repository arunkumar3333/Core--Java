package MultiThreading;
class employs{
    String name;
    String id;
    employs(String n, String id){
        this.id=id;
        this.name=n;
    }
    void diplay(){
        System.out.println("Name:-"+name+"\t ID:-"+id);
    }
}
class Developer extends employs implements Runnable{
    String name;
    String id;
    Developer(String n, String i){
        super(n,i);
    }

    @Override
    public void run() {
        System.out.println(" is developing the code from scratch.");
    }
}
public class Project {
    public static void main(String[] args) {
    Developer developer=new Developer("Arun","1VE24");
    developer.diplay();
    try {
        Thread.sleep(4000);
    }catch (Exception e){
        System.out.println(e);
    }
    Thread dev=new Thread(developer);
    dev.start();
    }
}
