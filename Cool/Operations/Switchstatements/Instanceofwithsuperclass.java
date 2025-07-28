package Cool.Operations.Switchstatements;
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        if (myAnimal instanceof Cat) {
            System.out.println("myAnimal is actually a Cat");
            ((Cat) myAnimal).makeSound();
        } else {
            System.out.println("myAnimal is NOT a Cat");
        }
        if (myAnimal instanceof Animal) {
            System.out.println("myAnimal is an Animal");
        }
    }
}

    





