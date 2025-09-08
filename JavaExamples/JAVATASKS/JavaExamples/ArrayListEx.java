package JavaExamples;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> student= new ArrayList<>();
        student.add("mani");
        student.add("mini");
        student.add("mahi");
        student.add("madhu");
        student.add("mani");
        System.out.println("student list" +student );
    System.out.println(" first student " + student.get(0));
    student.set(2, "eve"); 
    System.out.println("after replacing the element" + student);
    student.remove(0);
    System.out.println("after removing mani" + student );
    System.out.println("final student list");
    for(String students:student)
    {
        System.out.println("students");
        System.out.println("total student list" +student.size());
    }
}
}
