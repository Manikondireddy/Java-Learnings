package JavaExamples.Collections12;
import java.util.Queue;
import java.util.LinkedList;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> que= new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        System.out.println("Queue : " +que);
        int  front = que.remove();
        System.out.println("After removing :"  + front);
        System.out.println("updated queue :" + que);
        int peeked = que.peek();
        System.out.println("peeked element :" + peeked);
        que.add(80);
        System.out.println("updated queue :" +que);



        

        

    }


            
        };
        
    
