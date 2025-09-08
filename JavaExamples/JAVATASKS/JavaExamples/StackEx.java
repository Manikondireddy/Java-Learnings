package JavaExamples;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> number= new Stack<>();
        number.push(10);
        number.push(20);
        number.push(30);
        number.push(40);
        System.out.println("stack :" + number);
        System.out.println("peek element " + number.peek());
        System.out.println("push the top element :" + number.push(20));
        System.out.println("pop the top element :" + number.pop());
        System.out.println("pop the top element :" + number.pop());
        System.out.println("check is stackis emty :" + number.isEmpty());
        System.out.println("check stack size : " + number.size());



    }
   

        


    
        
    }
    

