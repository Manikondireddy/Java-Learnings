package Cool.Operations.Switchstatements;

public class Switchonchar {

    
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    public static void main(String[] args) {
        
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Grade A: Excellent!");
                break;
            case 'B':
                System.out.println("Grade B: Good job!");
                break;
            case 'C':
                System.out.println("Grade C: Fair effort.");
                break;
            default:
                System.out.println("Grade: Unknown");
        }
        String fruit = "Mango";
        switch (fruit) {
            case "Apple":
                System.out.println(" Apple is sweet.");
                break;
            case "Banana":
                System.out.println(" Banana is energetic.");
                break;
            case "Mango":
                System.out.println(" Mango is the king!");
                break;
            default:
                System.out.println(": No match found.");
        }
        Day today = Day.TUESDAY;
        switch (today) {
            case MONDAY:
                System.out.println(": Start of the week.");
                break;
            case TUESDAY:
                System.out.println(": Let's keep moving.");
                break;
            case WEDNESDAY:
                System.out.println(": Midweek checkpoint.");
                break;
            case THURSDAY:
                System.out.println(": Almost there!");
                break;
            case FRIDAY:
                System.out.println(": TGIF!");
                break;
            default:
                System.out.println(": Just another day.");
        }
    }
}
    

