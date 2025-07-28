package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods.JavaConstructors;
public class person{
    String name;
    int age;
    String city;
    public person() {
        name = "Unknown";
        age = 0;
        city = "Banglore";
    }
    public person(String name) {
        this.name = name;
        age = 0;
        city = "Chennai";
    }
    public person(String name, int age) {
        this.name = name;
        this.age = age;
        city = "Unspecified";
    }
    public person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person("Mani");
        person p3 = new person("Mahi", 28);
        person p4 = new person("Madhu", 35, "Hyderabad");

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();
    }
}

    
