package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // FIFO(First in First out)
        queue.offer(1);
/**
 The offer method is used to add elements to the queue because it inserts
 the specified element into the queue if it is possible to do so immediately
 without violating capacity restrictions. Unlike the add method,
 offer does not throw an exception if the element cannot be added.
 */

//        queue.add(1);
        queue.offer(2);
        queue.offer(4);
        queue.offer(5);
        queue.offer(10);
        queue.offer(11);

        System.out.println(queue);
//        queue.remove();
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println("========================================");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println(queue.poll());

        // it will throw exception but poll will not it
//        System.out.println(queue.remove());
    }
}
