package collection_framework;


import java.util.ArrayDeque;

public class Dequeue_1 {
    public static void main(String[] args) {


// Deque (Double Ended Queue) allows insertion and removal of elements from both ends.

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(10);
        deque.offerLast(20);
        deque.offerFirst(30);
        deque.offerFirst(50);
        deque.offerFirst(60);

        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

    }
}
