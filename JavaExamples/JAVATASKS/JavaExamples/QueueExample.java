package JavaExamples;
    import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println("Queue after adding elements: " + queue);
        String head = queue.peek();
        System.out.println("Head of the queue: " + head); 
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement); 
        System.out.println("Queue after removing an element: " + queue);
        queue.offer("Date");
        System.out.println("Queue after offering an element: " + queue); 
}
}

