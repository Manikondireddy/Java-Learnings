package Cool;

public class Splitmethod {
    public static void main(String[] args) {
        String sentence = "apple,banana,orange";

        String[] fruits = sentence.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
    

