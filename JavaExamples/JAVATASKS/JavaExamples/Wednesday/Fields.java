package JavaExamples.Wednesday;
import java.util.ArrayList;

public class Fields {
    public static void main(String[] args) {
        ArrayList<String> m= new ArrayList<>();
        m.add("radha");
        m.add("krishna");
        m.add("mahi");
        m.add("megha");
        m.add("mouni");
        m.add("mouli");
        m.add("bhanu");
        m.add("mali");
        m.add("mani");
        m.add("mini");
        System.out.println("number of students :" + m);
        m.add("main");
        System.out.println("after adding name :" + m);
        m.remove("mani");
        System.out.println("after removing : " + m);
    //     String Searchname= "bhanu";
    //     if(m.contains(Searchname))
    //     {
    //         System.out.println(Searchname + " is in the list" );
    //     }
    //     else{
    //         System.out.println(Searchname + "not in the list ");
    //     }
    // }
    // System.out.println("Search for students :" + m.contains("mali") );
    String Searchname= "mahi";
    if(m.contains(Searchname))
    {
        System.out.println("is in the list :" + Searchname);
    }
    else{
        System.out.println("not in the list :" + Searchname);
    }

    
}
}
