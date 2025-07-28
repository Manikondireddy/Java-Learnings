package Cool;
public class Inheritance {
    int c=80;

}
class Demo extends Inheritance{
    void test()
    {
        System.out.println("hello");

    }
}
class Mainclass1
{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.c);
        d1.test();
    }
}
    

