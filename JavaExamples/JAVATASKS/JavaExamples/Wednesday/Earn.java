package JavaExamples.Wednesday;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Earn {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        stack.push("mango");
        stack.push("bannana");
        stack.push("pineapple");
        stack.push("grapes");
        stack.push("guava");
        System.out.println("original stack :" + stack);
        System.out.println("push the elements into the stack (push) :" + stack.push("orange"));
        System.out.println("after push into the stack :" + stack);
        System.out.println("first  ino the stack pop()  :" + stack.pop());
        System.out.println("top (peek()) :" + stack.peek());



        Queue<String>queue = new LinkedList<>();
        
        queue.add("car");
        queue.add("bike");
        queue.add("scooty");
        queue.add("jeep");
        queue.add("aeroplane");
         System.out.println("Queue after offer: " + queue);

      
        System.out.println("Front element (peek): " + queue.peek());

        System.out.println("Removed element (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        {

        }
            
        }

    }
    

