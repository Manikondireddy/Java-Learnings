package JavaExamples; 
    import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(5);
        pq.offer(20);
        pq.offer(2);
        System.out.println("Elements in order of priority:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); 
        }
    }
}
    

