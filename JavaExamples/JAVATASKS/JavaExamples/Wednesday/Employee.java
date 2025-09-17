package JavaExamples.Wednesday;
import java.util.HashMap;

public class Employee {
    public static void main(String[] args) {
        HashMap<Integer,String> employe= new HashMap<>();
        employe.put(23, "Mani");
        employe.put(24, "mini");
        employe.put(45,"mahi");
        employe.put(34, "mouli");
        employe.put(20,"main");
        System.out.println("employe :" + employe);
System.out.println("employe name by id 34 :" + employe.get(34));
  
    
}
}
