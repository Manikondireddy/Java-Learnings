package JavaExamples;
import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> books= new ArrayList<>();
        books.add("java basics");
        books.add("java notes");
        books.add("python basics");
        books.add("c basics notes");
        books.add("java basics");
        System.out.println("getting basics books" + books.get(0));
        for(String book:books)
        {
            System.err.println(book);
        }
        books.remove(1);
        System.out.println("removing  java basics" + books);

        
    }
    
}
