package Java8Features;

import java.util.function.Consumer;

public class FuctionalInterfaceConsumaer2 {
    public static void main(String[] args) {
        Consumer<Integer> obj=new Consumer<Integer>(){
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        obj.accept(7);
    }
}
//follow up FuctionalInterfaceConsumaer3 - for lamda expresion