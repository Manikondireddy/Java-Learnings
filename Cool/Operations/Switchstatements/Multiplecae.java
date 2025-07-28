package Cool.Operations.Switchstatements;

public class Multiplecae {
   
    public static void main(String[] args) {
        String[] lyrics = {
            "🎵 Twinkle, twinkle, little star",
            "How I wonder what you are",
            "Up above the world so high",
            "Like a diamond in the sky 🎵"
        };

        for (String line : lyrics) {
            System.out.println(line);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Oops, got interrupted!");
            }
        }

        System.out.println(" That's our little performance");
    }
}
    

