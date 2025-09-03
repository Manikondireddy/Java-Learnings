package JavaExamples;

// abstract class Person {
//     abstract void eat();
//     abstract void  exercise();
// }
// class Athlete extends Person {
//     @Override
//     void eat()
//     {
//     System.out.println("athlete eats healthy food");
//     }
//     @Override
//       void exercise()
//      {
//            System.out.println("athlete follow healthy diet");

//     }
    

// } 



// class LazyPerson extends Person{
//     @Override
//     void eat()
//     {
//         System.out.println("very lazy persons not follow daily food diet");
//     }
//     @Override
//     void exercise()
//     {
//         System.out.println("not follow any diet");
//     }
    
// }
//     class Demo{
//         public static void main(String[] args) {
//             Person p1= new Athlete();
//             p1.eat();
//             p1.exercise();
//             System.out.println("hi");
//             Person p2= new LazyPerson();
//             p2.eat();
//             p2.exercise();
//             System.out.println("hello");
//         }
//     }

abstract class Person{
    abstract void eat();
     abstract void exercise();
}
class Athlete extends Person{
    // @Override
     void eat()
    {
        System.out.println("Athlete eats healthy food");
    }
    // @Override
     void exercise()
    {
        System.out.println("Athlete follow diet exercies and diet");
    }


}
class LazyPerson extends Person{
    // @Override
    void eat() {
        {
            System.out.println("lazy person dont not follow any diet");
        }
    }
    // @Override
    void exercise()
    {
        System.out.println("lazy person doesnt follow any exercise");
    }
}
class Demo{
    public static void main(String[] args) {
        Person p1 =new Athlete();
        p1.eat();
        p1.exercise();
        System.out.println("hello");
        Person p2 = new LazyPerson();
        p2.eat();
        p2.exercise();
        System.out.println("hello good evening");
    }
}
