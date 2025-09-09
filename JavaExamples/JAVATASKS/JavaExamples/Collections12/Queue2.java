package JavaExamples.Collections12;
import java.util.Queue;
import java.util.LinkedList;

public class Queue2 {
public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            q.add(i);
            System.out.println(" Queue :" + q);
            // int removedele = q.remove();
            System.out.println("After removing :" + q.remove());
            System.out.println(q);
            // int head = q.peek();
            System.out.println("After peeking :" + q.peek());
            System.out.println("size of q :" + q.size());
            



    
    }
}