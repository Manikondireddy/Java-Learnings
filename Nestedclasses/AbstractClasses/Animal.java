package AbstractClasses;
abstract class Animals {
    abstract void makeSound();

    void eat() {
        System.out.println("make sounds loudly");
    }
}
class Cat extends Animals {
    void makeSound() {
        System.out.println("Cat says Meow");
    }
}
class Cow extends Animals {
    void makeSound() {
        System.out.println("Cow eat grass");
    }
}
class Duck extends Animals{
    void makeSound() {
        System.out.println("Duck can walk and swim");
    }
}
public class Animal {
    public static void main(String[] args) {
        Animals[] zoo = { new Cat(), new Cow(), new Duck() };

        for (Animals animal : zoo) {
            animal.makeSound();
            animal.eat();
            System.out.println(" ");
        }
    }
}

    

