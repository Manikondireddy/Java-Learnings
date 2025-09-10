package JavaExamples.Collections12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer>student = new ArrayList<>();
        student.add(29);
        student.add(12);
        student.add(15);
        student.add(5);
        student.add(276);
        student.add(17);
        student.add(3);
        student.add(-76);
        System.out.println("Student :" + student);
    int max= Collections.max(student);
        int min= Collections.min(student);
System.out.println("maximum student : " +max);
System.out.println("minimum student :" + min);

        
    }
    
}
