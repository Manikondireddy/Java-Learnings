package Cool.Operations.Switchstatements.Javainstanceoperator;

public class Anima1 {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}
class Dog extends Animal {
    void fetch() {
        System.out.println("Dog is fetching the ball...");
    }
    public static void main(String[] args) {
        Animal pet = new Dog();
        if (pet instanceof Dog) {
            Dog myDog = (Dog) pet;
            myDog.makeSound();
            myDog.fetch();
        } else {
            System.out.println("pet is not a Dog");
        }
    }
}
    

