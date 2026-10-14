package CollectionFrameworks;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.offer(25);
        q.offer(35);
        q.offer(45);
        q.offer(15);
        System.out.println("Elements based on priority(ascending order): "+q);
        System.out.println("Removing Element at first index:"+q.poll()+"\n"+q);
        System.out.println("Fetching first element of Queue: "+q.peek());
    }
}
