import java.util.*;

public class StackQueueDemo {
    public static void main(String[] args) {
        // Stack Implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from Stack: " + stack.pop());
        System.out.println("Top of Stack: " + stack.peek());
        System.out.println("Stack after pop: " + stack);

        System.out.println("\n---------------------\n");

        // Queue Implementation
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue: " + queue);
        System.out.println("Removed from Queue: " + queue.poll());
        System.out.println("Front of Queue: " + queue.peek());
        System.out.println("Queue after removal: " + queue);
    }
}