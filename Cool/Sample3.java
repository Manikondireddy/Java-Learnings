package Cool;
public class Sample3 {
    int a =90;
}
class Demo3 extends Sample3{
    void test()
    {
        System.out.println("itstest");
    }
} 
class Tester3 extends Sample3{
    void fo()
    {
        System.out.println("its fo");
    }
    }
    class Mainclass3
    {
        public static void main(String[] args) {
            
            {
                System.out.println("object");
                Demo3 d1= new Demo3();
                System.out.println(d1.a);
                d1.test();
                System.out.println("test3");
                Tester3 t1=new Tester3();
                System.out.println(t1.a);
                t1.fo();

            }
        }
    }
    
