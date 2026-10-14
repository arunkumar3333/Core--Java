
package MultiThreading;

class One implements Runnable{
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
class Two implements Runnable{
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
class Three implements Runnable{
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
public class RunnableExample {
    public static void main(String[] args) {
        One thread1=new One();
        Two thread2=new Two();
        Three thread3=new Three();
        Thread T1=new Thread(thread1);
        Thread T2=new Thread(thread2);
        Thread T3=new Thread(thread3);
        T1.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        T2.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        T3.start();
    }
}

