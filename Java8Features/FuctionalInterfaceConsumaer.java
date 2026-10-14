package Java8Features;

import java.util.List;
import java.util.function.Consumer;

class demo implements Consumer<Integer>{
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}
public class FuctionalInterfaceConsumaer {
    public static void main(String[] args) {
       Consumer<Integer> obj= new demo();
       obj.accept(1);
        obj.accept(1);
    }
}

//follow up FuctionalInterfaceConsumaer2