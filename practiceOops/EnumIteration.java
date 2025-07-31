package practiceOops;

public class EnumIteration {

    public class EnumIterationExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println("Day: " + day);
        }
    }
}
}






    

