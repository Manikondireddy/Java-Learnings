package Cool.Operations.Switchstatements.Javainstanceoperator;
class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }

    void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        if (myDog instanceof Dog) {
            System.out.println("myDog is an instance of Dog");
            myDog.bark();
        } else {
            System.out.println("myDog is NOT an instance of Dog");
        }
    }
}
    

