package CollectionFrameworks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(34);
        set.add(34);
        set.add(45);
        set.add(89);
        set.add(67);
        System.out.println("HashSet elements no duplicates: "+set);
        System.out.println("Removed 89: "+set.remove(89)+"    After removing: "+set);
        System.out.println("Is set empty: "+set.isEmpty());
        System.out.println("Is set contains 45: "+set.contains(45));
        System.out.println("Set size: "+set.size());
        set.add(87);
        System.out.println(set);
        System.out.println();

        Set<Integer> ts=new TreeSet<>();
        ts.add(34);
        ts.add(34);
        ts.add(45);
        ts.add(89);
        ts.add(67);
        System.out.println("TreeSet elements no duplicates: "+ts);
        System.out.println("Removed 89: "+ts.remove(89)+"    After removing: "+ts);
        System.out.println("Is set empty: "+ts.isEmpty());
        System.out.println("Is set contains 45: "+ts.contains(45));
        System.out.println("Set size: "+ts.size());
        ts.add(87);
        System.out.println(ts);
        System.out.println();

        Set<Integer> ls=new LinkedHashSet<>();
        ls.add(34);
        ls.add(34);
        ls.add(45);
        ls.add(89);
        ls.add(67);
        System.out.println("LinkedHashSet elements no duplicates: "+ls);
        System.out.println("Removed 89: "+ls.remove(89)+"    After removing: "+ts);
        System.out.println("Is set empty: "+ls.isEmpty());
        System.out.println("Is set contains 45: "+ls.contains(45));
        System.out.println("Set size: "+ls.size());
        ls.add(87);
        System.out.println(ls);
    }
}
