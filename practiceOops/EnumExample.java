package practiceOops;
public class EnumExample {
        enum Day {
        MONDAY(true),
        TUESDAY(true),
        WEDNESDAY(true),
        THURSDAY(true),
        FRIDAY(true),
        SATURDAY(false),
        SUNDAY(false);

        private final boolean isWeekday;

        Day(boolean isWeekday) {
            this.isWeekday = isWeekday;
        }

        public boolean isWeekday() {
            return isWeekday;
        }
        public static void printWeekendDays() {
            System.out.print("Weekend days: ");
            for (Day day : Day.values()) {
                if (!day.isWeekday()) {
                    System.out.print(day.name() + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("Today is " + today);
        System.out.println("Is it a weekday? " + today.isWeekday());
        Day.printWeekendDays();
    }
}
    

