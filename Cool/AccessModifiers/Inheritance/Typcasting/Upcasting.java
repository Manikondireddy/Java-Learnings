package Cool.AccessModifiers.Inheritance.Typcasting;
class Flower {
    void bloom() {
        System.out.println("The flower is blooming.");
    }
}

class Rose extends Flower {
    void fragrance() {
        System.out.println("Rose smells amazing!");
    }
}

class Main {
    public static void main(String[] args) {
        Flower myFlower = new Rose();
        myFlower.bloom();

    } class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

 class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Animal myDog = new Dog();
        myDog.sound();    
    }
}
}
    

