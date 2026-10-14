package Java8Features;
import java.util.Arrays;
import java.util.List;
//import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapFuctionalinterface {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(8,5,4,9,3);
        //Function<Integer, Integer> obj=i -> i*2;
        Stream<Integer> s1=l1.stream().filter(i->i%2==0).map(i->i*2);
        s1.forEach(System.out::println);
    }
}
