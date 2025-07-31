package practiceOops;

// import Dog;

interface Animals {
    void makeSound();
}
class Dog implements Animals {
    public void makeSound() {
        System.out.println("Night dog make sounds");
    }
}

class Cat implements Animals {
    public void makeSound() {
        System.out.println("cat looks like cute");
    }
}
 public class Animal {
    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
    

