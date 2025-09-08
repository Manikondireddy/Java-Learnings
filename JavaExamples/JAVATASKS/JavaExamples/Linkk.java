package JavaExamples;
import java.util.ArrayList;
import java.util.LinkedList;
import java .util.List;

public class Linkk {
    public static void main(String[] args) {
        LinkedList<String> browser= new LinkedList<>();
        browser.add("google.com");
        browser.add("youtube.com");
        browser.add("linkedin.com");
        browser.add("github.com");
        System.out.println("Browser check : " + browser);
        System.out.println("check the stack :" + browser.get(0));
        browser.set(2,"snapcaht");
        System.out.println("after replacing : " + browser);
        browser.remove(3);
        System.out.println("after removing  :" + browser);
        for(String browsers:browser)
        {
            System.out.println(browser);
            System.out.println("final list : " + browser.size());
        }



        
    }
    
}
