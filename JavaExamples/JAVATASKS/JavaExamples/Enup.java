package JavaExamples;
class Student {
    private String name; 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Enup {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Mani");                 
        System.out.println(s.getName());    //getter & setters are public methods
    }
}

    

