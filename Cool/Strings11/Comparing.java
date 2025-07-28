package Cool.Strings11;

public class Comparing {
public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        String str3 = new String("Java");

        System.out.println("equals(): " + str1.equals(str2)); 
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2)); 
        System.out.println("== operator: " + (str1 == str3));
        System.out.println("compareTo(): " + str1.compareTo(str2)); 
        System.out.println("compareToIgnoreCase(): " + str1.compareToIgnoreCase(str2)); 
    }
}
    

