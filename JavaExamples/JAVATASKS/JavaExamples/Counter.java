package JavaExamples;

// public class Counter {
    
//         static  int count =0;
//     Counter()
    
//         {
//             count++;
//             System.out.println("object created.current count" + count );

//         }
//     }

    
//     class CounterDemo
//     {
//         public static void main(String[] args) {
//             Counter c1= new Counter();
//             Counter c2 = new Counter();
//             Counter c3= new Counter();
//             Counter c4= new Counter();
//             Counter c5= new Counter();
//         }
//     }

    

// class Counter{
//     static int count;
//     Counter()
//     {
//         count++;
//         System.out.println("object created.current count" + count);
//     }
// }
// class Demo{
//     public static void main(String[] args) {
//         Counter C1=new Counter();
//         Counter c2= new Counter();
//         Counter c3= new Counter();
//         Counter c4= new Counter();
//         Counter c5= new Counter();

//     }
// }

class Counter{
    static int count;
    Counter()
    {
        count++;
        System.out.println("object created.current count" + count);
    }
}
class Read{
    public static void main(String[] args) {
        Counter c1 =new Counter();
        Counter c2= new Counter();
        Counter c3= new Counter();
        Counter c4= new Counter();
        Counter c5= new Counter();
        Counter c6= new Counter();
    }
}