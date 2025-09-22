package JavaExamples.Wednesday.THURSDAy;

public class Counter {
    private static int count=0;
   public  Counter()
    {
        count++;
        System.err.println("object created :" + count);
    }
    public static void main(String[] args) {
        Counter c= new Counter();
        Counter c1= new Counter();
        Counter c2= new Counter();
    }
    
}

