package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods.JavaConstructors;

public class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Elephant", 10);
        Animal a2 = new Animal("Tiger", 5);
        a1.displayInfo();
        a2.displayInfo();
    }
}
    

