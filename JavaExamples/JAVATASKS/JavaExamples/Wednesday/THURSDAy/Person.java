package JavaExamples.Wednesday.THURSDAy;

abstract class Person {
    abstract void eat();
    abstract void exercise();

}
class Athelete extends Person{
    @Override
        public void eat()
        {
            System.out.println("athelete eat good protien food ");
        }
        @Override
        public void exercise()
        {
            System.out.println("athelete do exercise daily ");
        }
        
    }
    class Lazyperson extends Athelete{
        @Override
        public void eat()
        {
            System.out.println("lazy peoples will not eat good food ");

        }
        @Override
        public void exercise()
        {
            System.out.println("lazy person will do exercise ");
        }
        public static void main(String[] args) {
            Person b= new Athelete();
            Person b1= new Lazyperson();
            b.eat();
            b1.eat();
            b1.exercise();
            b.exercise();
        }
    }
    

