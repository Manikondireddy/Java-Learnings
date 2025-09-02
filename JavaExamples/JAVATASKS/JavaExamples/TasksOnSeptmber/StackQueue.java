package JavaExamples.TasksOnSeptmber;
import java.util.*;
public class StackQueue {
    public static void main(String[] args) {
        System.out.println("STACK ");
        Stack<Integer> stack = new Stack<>(); 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("\n----- QUEUE");
        Queue<String> queue = new LinkedList<>(); 
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue after offers: " + queue);
        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}

    

