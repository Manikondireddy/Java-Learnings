package Cool.AccessModifiers;

public class Person {
    private String name;
    public Person(String personName) {
        name = personName;
    }
    public void displayName() {
        System.out.println("Name: " + name);
    }
}

 class Main {
    public static void main(String[] args) {
        Person p = new Person("Mani");
        p.displayName();
    }
}

    

