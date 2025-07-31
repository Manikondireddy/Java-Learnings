package practiceOops;
public class EnumtoStringMethod {
    enum Season {
        SPRING, SUMMER, FALL, WINTER;
        public String toString() {
            switch (this) {
                case SPRING:
                    return "Spring ";
                case SUMMER:
                    return "Summer ";
                case FALL:
                    return "Fall ";
                case WINTER:
                    return "Winter";
                default:
                    return super.toString();
            }
        }
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }
}
    

