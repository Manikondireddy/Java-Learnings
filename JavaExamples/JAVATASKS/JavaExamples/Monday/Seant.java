package JavaExamples.Monday;

public class Seant {
    static int count=0;
Seant()
{
    count++;
    System.out.println("repeat the count after creating object :" + count);

}
}
class Maven
{
    public static void main(String[] args) {
        Seant s1= new Seant();
        Seant s2= new Seant();
        Seant s3= new Seant ();
        Seant s4= new Seant();
        System.out.println("print total count is possible in the last :" + Seant.count);
    }

}


