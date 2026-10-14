package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceBinaryOperator {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(8,2,9,3,7,4);
        //BinaryOperator<Integer> b= (i,j )-> i+j;
        // Consumer.predicator.Function.BinaryOperator.
        int a1=l1.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(i,j)->i+j);
        System.out.println(a1);

    }
}
