package Cool.Strings11;

public class Replace {

    public static void main(String[] args) {
        String original = "apple banana apple orange apple";

        
        String replacedChar = original.replace('a', '@');
        String replacedWord = original.replace("apple", "mango");

        String replacedAll = original.replaceAll("apple", "grape");

     
        String replacedFirst = original.replaceFirst("apple", "kiwi");

        System.out.println("Original:       " + original);
        System.out.println("replace('a','@'): " + replacedChar);
        System.out.println("replace(\"apple\",\"mango\"): " + replacedWord);
        System.out.println("replaceAll(\"apple\",\"grape\"): " + replacedAll);
        System.out.println("replaceFirst(\"apple\",\"kiwi\"): " + replacedFirst);
    }
}
    

