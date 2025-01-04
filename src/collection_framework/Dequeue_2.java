package collection_framework;


import java.util.ArrayDeque;

public class Dequeue_2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        // Using ArrayDeque as a stack is preferred over the inbuilt Stack class because:
        // 1. ArrayDeque is faster as it doesn't have the overhead of synchronization.
        // 2. ArrayDeque provides more versatile methods for stack operations.
        // 3. The inbuilt Stack class is considered legacy and is not recommended for new code.

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pollFirst());
        System.out.println(stack.peek());
//        System.out.println(stack.poll());
        System.out.println(stack);

        System.out.println("===================================================");

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(11);
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(16);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.pollLast());
        System.out.println(queue);
    }
}
