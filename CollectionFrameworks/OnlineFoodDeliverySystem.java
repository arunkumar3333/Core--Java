package CollectionFrameworks;
class Orders implements Runnable{
    String foodName;
    int id;
    Orders(String fn, int id){
        this.foodName=fn;
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println("Order: "+id+"\t "+foodName);
        System.out.println(id+" Order is confirmed ");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(id+" order is processing");
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(id+" oder is packed");
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(id+" order as ready for delivery.");
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
    Orders orders=new Orders("Pizza",101);
    Orders orders1=new Orders("Burger",102);
    Orders orders2=new Orders("Biryani",103);
    Thread thread=new Thread(orders);
    Thread thread1=new Thread(orders1);
    Thread thread2=new Thread(orders2);
    thread.start();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }
    thread1.start();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }
    thread2.start();
    }
}
