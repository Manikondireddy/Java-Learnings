package JavaExamples.Collections12;
import java.util.Queue;
import java.util.LinkedList;


public class Queue23 { 
    public static void main(String[] args) {
        Queue<Integer> qi= new LinkedList<>();
        qi.add(100);
        qi.add(200);
        qi.add(300);
        qi.add(400);
        qi.add(500);
        qi.add(600);
        qi.add(700);
        System.out.println("queue order :"     + qi);
        System.out.println("remove element :" + qi.remove());
        System.out.println(qi);
        System.out.println("peeking the element :"     + qi.peek());
        System.out.println(qi);
        System.out.println("poll the element :" + qi.poll());
        System.err.println(qi);
        System.out.println("size of the qi  :" + qi.size());
        int first= qi.peek();
        System.out.println("deleting last element :" + first);
        
    }
    
} 
