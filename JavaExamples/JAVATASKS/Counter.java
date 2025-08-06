package JavaExamples.JAVATASKS;

public class Counter {
    static int count =0;
    public Counter ()
    {
        count ++;
    }
    public static void main(String[] args) {
        Counter C1 = new Counter();
        Counter C2= new Counter();
        Counter c3 =new Counter();
        System.out.println("Number of objects created");
    }
    }

    
    

