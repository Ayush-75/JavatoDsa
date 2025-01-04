package collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        pq.offer(17);
        pq.offer(14);
        pq.offer(15);
        pq.offer(12);
        pq.offer(13);
        pq.offer(16);
        pq.offer(10);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
