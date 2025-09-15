package JavaExamples.Monday;

public class Counter {
    static int  count =0;
    Counter()
    {
        count++;
        System.out.println("object created :" + count);
    }
}
    class Bean
    {
        public static void main(String[] args) {
            Counter c= new Counter();
            Counter c2=new Counter();
            Counter c3= new Counter();
            Counter c4= new Counter();
            System.out.println("final valie of count : " +Counter.count);

        }
    }

    

    

