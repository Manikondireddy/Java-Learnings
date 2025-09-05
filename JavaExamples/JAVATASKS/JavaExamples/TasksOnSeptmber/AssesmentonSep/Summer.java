package JavaExamples.TasksOnSeptmber.AssesmentonSep;
interface Student {
    void teacher();
}
interface Children {
    void parent();
}
class Park implements Student, Children {
    @Override
    public void teacher() {
        System.out.println("Teacher gives more knowledge");
    }

    @Override
    public void parent() {
        System.out.println("Parents take care of children");
    }
}
public class Summer {
    public static void main(String[] args) {
        Park h = new Park();
        h.teacher();
        h.parent();
    }
}

    

