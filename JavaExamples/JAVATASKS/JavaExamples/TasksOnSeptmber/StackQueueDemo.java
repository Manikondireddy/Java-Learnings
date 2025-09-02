package JavaExamples.TasksOnSeptmber;
class MyStack {
    private int[] stack;
    private int top;
    private int size;

    public MyStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class MyQueue {
    private int[] queue;
    private int front, rear, size, capacity;
    public MyQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            System.out.println(value + " added to queue");
        }
    }
    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " removed from queue");
            front = (front + 1) % capacity;
            size--;
        }
    }
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
}

public class StackQueueDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("-");
        MyQueue queue = new MyQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}

    

