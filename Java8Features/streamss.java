package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
class demo2 implements Predicate<Integer>{
    @Override
    public boolean test(Integer i) {
        return i%2==0;
    }
}
public class streamss {  //Predicates
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,3,5,68, 70);
        Predicate<Integer> p=new demo2();
        Stream<Integer> s1=l1.stream().filter(p);
        s1.forEach(System.out::println);
    }
}
