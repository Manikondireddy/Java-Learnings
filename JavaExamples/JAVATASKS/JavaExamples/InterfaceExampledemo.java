package JavaExamples;
interface Animal {
    void sound();   
    void sleep();  
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}
public class InterfaceExampledemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}
