package JavaExamples;
    import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("First");
        myStack.push("Second");
        myStack.push("Third");
        System.out.println("Stack: " + myStack); 
        System.out.println("Top element: " + myStack.peek()); 
        System.out.println("Popped: " + myStack.pop());
        System.out.println("Stack after pop: " + myStack);
        System.out.println("Is stack empty? " + myStack.isEmpty());
    }
}
    

