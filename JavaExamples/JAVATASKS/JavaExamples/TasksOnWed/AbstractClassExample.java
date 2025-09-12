package JavaExamples.TasksOnWed;

abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}
