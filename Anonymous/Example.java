package Anonymous;
interface anony{
    void call();
}
public class Example {
    public static void main(String[] args) {
        anony any=new anony() {
            public void call(){
                System.out.println("Anonymous Class");
            }
        };
        any.call();
    }
}
