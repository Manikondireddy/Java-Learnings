package JavaExamples;

import java.util.Vector;

public class Vectorcolor {
    public static void main(String[] args) {
        Vector<String> color= new Vector<>();
        color.add("pink");
        color.add("yellow");
        color.add("grey");
        color.add("orange");
        color.add("blue");
        System.out.println("all colors" + color);
        System.out.println("first color:" + color.get(0));
        color.remove(2);
        System.out.println("After removing:" + color);
        color.set(3,"babypink");
        System.out.println("After replacing:" + color);
        for(String colors:color)
        {
            System.out.println(color);
            System.out.println("colors list:" + color.size());
        }


    }
    
}
