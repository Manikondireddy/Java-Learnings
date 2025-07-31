package practiceOops;

public class Company {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is " + today);
        System.out.println("Numeric value of " + today + " is " + today.ordinal());
    }
}    

