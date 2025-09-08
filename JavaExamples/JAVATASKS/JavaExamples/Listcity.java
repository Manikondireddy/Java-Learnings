package JavaExamples;

import java.util.ArrayList;
import java.util.List;

public class Listcity {
    public static void main(String[] args) {
        List<String> cities= new ArrayList<>();
        cities.add("banglore");
        cities.add("hyderabad");
        cities.add("chennai");
        cities.add("kerela");
        System.out.println("All cities");
        for(String city:cities)
        {
        System.out.println(city);

    }
    
}
}
