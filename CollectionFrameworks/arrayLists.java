package CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class arrayLists {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        l1.remove(4);
        System.out.println("Removing element at 4th index:"+l1);
        System.out.println(l1.contains(30));
        // l1.addFirst(5);
        // System.out.println("Reversed Array list:"+l1.reversed());
        System.out.println("is list contains 30:"+l1.contains(30));
        //l1.addFi
    }
}
