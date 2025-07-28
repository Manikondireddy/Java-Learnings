package Cool;

public class Ternaryoperastypecheck {
    public static void main(String[] args) {
        Object value = "Hello World"; 
        String message = (value instanceof String) 
             ? "It's a ternary operatory check or not!" 
             : "It's NOT a String.";
             System.out.println(message);
    }
}

    

