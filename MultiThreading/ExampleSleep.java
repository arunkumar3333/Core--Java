
package MultiThreading;

class one1 extends Thread{
    public void run(){
        for(int i=0;i<2;i++){
            System.out.println("Thread 1");
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class two2 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Thread 2");
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class three3 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Thread 3");
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ExampleSleep {
    public static void main(String[] args) {
        one1 t1=new one1();
        two2 t2=new two2();
        three3 t3=new three3();
        t1.start();
        t2.start();
        t3.start();
    }
}

