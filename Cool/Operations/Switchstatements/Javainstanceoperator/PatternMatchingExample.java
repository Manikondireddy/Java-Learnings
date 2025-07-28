package Cool.Operations.Switchstatements.Javainstanceoperator;
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class PatternMatchingExample {
    public static void main(String[] args) {
        Animal pet = new Dog();
        if (pet instanceof Dog dog) {
            dog.bark();         // No need to cast!
            dog.makeSound(); 
        } else {
            System.out.println("pet is not a Dog");
        }
    }
}
    
        
