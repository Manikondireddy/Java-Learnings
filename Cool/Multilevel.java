package Cool;
public class Multilevel {
    int  y=90;
}
class Demo2 extends Multilevel
{
    void cool()
{
        System.out.println("hey");
    }
}
class Tester2 extends Demo2 {
    int x=70;
}
class Maincalss2{
    public static void main(String [] args)
    {
        Tester2 t1 = new Tester2();
        System.out.println(t1.x);
        System.out.println(t1.y);
        t1.cool();
    }
}


    

