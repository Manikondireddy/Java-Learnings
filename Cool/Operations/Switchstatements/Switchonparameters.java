package Cool.Operations.Switchstatements;

public class Switchonparameters {
public static void main(String[] args) {
        printDay("Thursday");
    }

    public static void printDay(String day) {
        switch (day) {
            case "Monday":
                System.out.println("Start of the workweek.");
                break;
            case "Tuesday":
                System.out.println("Still early in the week.");
                break;
            case "Wednesday":
                System.out.println("Midweek hustle.");
                break;
            case "Thursday":
                System.out.println("Almost there.");
                break;
            case "Friday":
                System.out.println("Weekend vibes incoming.");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Relax, it's the weekend!");
                break;
            default:
                System.out.println("Not a valid day.");
                break;
        }
    }
}
    

