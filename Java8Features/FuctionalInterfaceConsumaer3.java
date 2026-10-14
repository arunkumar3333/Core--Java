package Java8Features;

import java.util.function.Consumer;

public class FuctionalInterfaceConsumaer3 {
    public static void main(String[] args) {
        Consumer<Integer> obj=integer->
                System.out.println(integer);
    }
}
