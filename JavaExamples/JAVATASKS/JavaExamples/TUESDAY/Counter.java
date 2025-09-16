package JavaExamples.TUESDAY;

public class Counter {
static int count=0;
public Counter()
{
    count++;
    System.out.println("counter is created for first :" + count);

}
}
class Demo
{
    public static void main(String[] args) {
        Counter v= new Counter();
        Counter v1= new Counter();
        Counter v2= new Counter();
    }
}


  
    

