package JavaExamples.TasksOnSeptmber;

    public class Student {
    private int id;
    private String name;
    private char section;
    public Student(int id, String name, char section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
    @Override
    public String toString() {
        return "Student { " +"ID = " + id +", Name = '" + name + '\'' +", Section = " + section +" }";
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Mani", 'A');
        Student s2 = new Student(102, "Radha", 'B');

        System.out.println(s1);
        System.out.println(s2);
    }
}

    

