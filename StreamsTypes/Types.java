package StreamsTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Types {
    public static void main(String[] args) {
        //Streams Types
        // 1.Stream<T>
        List<Integer> list= Arrays.asList(45,76,34,67);
        //filter gives boolean value
        Stream<Integer> stream=list.stream().filter(i->i>=50); //it prints number if>50
        stream.forEach(System.out::println);

        //String example to print names length > 4
        List<String> names=List.of("Arun","Jak","Amaravathi");
        Stream<String> n=names.stream().filter(i->i.length()>4);
        n.forEach(System.out::println);

        // 2. IntegerStream
        System.out.println("Print sum of nums using IntStream");
        int num= IntStream.of(5,8,3,4).sum();
        System.out.println(num);
        IntStream intStream=IntStream.of(7,9,4,5,2);
        intStream.forEach(i-> System.out.print(i+"  "));
        System.out.println();

        // 3. LongStream
        System.out.println("LongStream Operations");
        LongStream phNo= LongStream.of(7411277145L,9535295887L);
        phNo.forEach(i-> System.out.print(i+"  "));
        System.out.println();
        System.out.println("Sum");
        long sum=LongStream.of(10,20,30,40).sum();
        System.out.println(sum);

        // 4. DoubleStream
        System.out.println("DoubleStream operations:-");
        double percentageAverage= DoubleStream.of(67.35,74.72,85.14,95.12).average().orElse(0.0);
        System.out.println(percentageAverage);

        DoubleStream percentage=DoubleStream.of(75.35,96.45,85.14,65.23);
        percentage.forEach(i-> System.out.print(i+"  "));
        System.out.println();

        // 1. Filter : to find the matching case or element
        List<Integer> nums=Arrays.asList(5,10,15,1,45);
        Stream<Integer> stream1=nums.stream().filter(i->i>10); // For filter-predicator is default method(FI)
        stream1.forEach(System.out::println); //for forEach default method is Consumer(Functional Interface)

        // 2.
    }
}