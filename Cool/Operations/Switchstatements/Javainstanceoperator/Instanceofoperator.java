package Cool.Operations.Switchstatements.Javainstanceoperator;
    class Animal {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {

    void fetch() {
        System.out.println("Dog is fetching...");
    }
    public static void main(String[] args) {
        Animal myPet = new Dog(); 
        if (myPet instanceof Dog) {
            Dog dog2 = (Dog) myPet;
            dog2.makeSound();
            dog2.fetch();
        } else {
            System.out.println("myPet is not a Dog");
        }
        Animal unknown = new Animal(); 

        if (unknown instanceof Dog) {
            Dog dog3 = (Dog) unknown;
            dog3.fetch();
        } else {
            System.out.println("unknown is NOT a Dog");
        }
    }
}
    

    
    

