package Java8Features;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Printing numbers using for loop");
        for(int i=0;i< l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        //System.out.println("Printing numbers Enhanced for method");
//        for(Integer i:l1){
//            System.out.print(i+" ");
//        }
        System.out.println("Printing numbers functional using reference");
        l1.forEach(i->System.out.print(i+"  "));
    }
}
