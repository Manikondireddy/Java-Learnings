package JavaExamples;

abstract class Pig
{
      abstract void eat();
}

class Fruit extends Pig{
    @Override
    void eat()
    {
        System.out.println("fruits is good for health");
    }
}
class Clothes extends Pig{
    @Override
    void eat()
    {
        System.out.println("clothes is good to see");
    }
}
class Mango extends Pig{
    @Override
    void eat()
    {
        System.out.println("mango is a fruit");
    }

}
public class Zebra {
    public static void main(String[] args) {
        Pig v= new Fruit();
        Pig v1= new Clothes();
        Pig v2 = new Mango();
        v.eat();
        v1.eat();
        v2.eat();
    }
    
}


