package Cool;

public class Bytescharacters {
public static void main(String[] args) {
        String text = "Mani";
        System.out.println("Characters:");
        for (int i = 0; i < text.length(); i++) {
            System.out.println("Character at index " + i + ": " + text.charAt(i));
        }
        byte[] byteArray = text.getBytes();
        System.out.println("\nBytes:");
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println("Byte at index " + i + ": " + byteArray[i]);
        }
    }
}
    

