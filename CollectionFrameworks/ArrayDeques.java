package CollectionFrameworks;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeques {
    public static void main(String[] args) {
        Queue<Integer> dq=new ArrayDeque<>();
        dq.offer(1);
        dq.offer(3);
        dq.offer(2);
        dq.offer(4);
        dq.offer(6);
        dq.offer(5);
        System.out.println("ArrayDeque elements: "+dq);
        System.out.println("Peek element: "+dq.peek());
        System.out.println("Poll(removing) element: "+dq.poll()+"\n"+dq);
        //dq.addAll(list.of());

    }
}
