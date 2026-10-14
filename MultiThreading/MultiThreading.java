package MultiThreading;
class first extends Thread{
    public void run(){
        for(int i=0;i<2;i++){
            System.out.println("Thread 1");
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class second extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Thread 2");
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class third extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Thread 3");
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        first th1=new first();
        second th2=new second();
        third th3=new third();
    th1.start();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
    th2.start();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
    th3.start();
    }
}
