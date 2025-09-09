package JavaExamples.Collections12;
import java.util.Queue;
import java.util.LinkedList;


public class Que {
    public static void main(String[] args) {
        Queue<String> fruit = new LinkedList<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("gvuava");
        fruit.add("pineapple");
        System.out.println("fruit : " +fruit);
        String front=fruit.remove();
        System.out.println("After removing :" + front);
        String peeked = fruit.peek();
        System.out.println("Peeked method :" + peeked);
        fruit.add("bannana");
        System.out.println("after updating :" + fruit);
        System.out.println("poll element :" + fruit.poll());
        System.out.println("update queue :" + fruit);
        fruit.offer("avocoda");
        System.out.println("update queue :" + fruit);


        
    }
    
}
