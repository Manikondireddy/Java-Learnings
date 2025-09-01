package JavaExamples;

public class Sample2 {
    int y=90;
}
class Demo2 extends Sample2{
    void cool()
    {
        System.out.println("hey its cool");
    }
}
class Tester2 extends Demo2{
    int x=70;
}
class Mainclass2
{
    public static void main(String[] args) {
        Tester2 t1= new Tester2();
        System.out.println(t1.x);
        System.out.println(t1.y);
    }
}

    

    

