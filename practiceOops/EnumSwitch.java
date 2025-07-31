package practiceOops;
    public class EnumSwitch{
    enum Traffic {
        RED, YELLOW, GREEN
    }
    public static void main(String[] args) {
        Traffic signal = Traffic.YELLOW;
        switch (signal) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Get ready to move.");
                break;
            case GREEN:
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown signal");
                break;
        }
    }
}
