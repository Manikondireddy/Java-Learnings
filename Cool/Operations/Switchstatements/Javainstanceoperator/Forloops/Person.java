package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops;
public class Person {
    String name;
    int age;
    String country;
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ananya";
        person1.age = 25;
        person1.country = "India";
        person1.displayInfo();
    }
}