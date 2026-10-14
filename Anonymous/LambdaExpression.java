package Anonymous;
interface ex{
    void demo();
}
public class LambdaExpression {
    public static void main(String[] args) {
        ex obj=()->{
            System.out.println("Hlo I am Lambda Expression implemented using Anonymous class, without it, it is not possible");
        };
        obj.demo();
    }
}
