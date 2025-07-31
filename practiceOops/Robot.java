package practiceOops;
interface Robots {
    void performTask();
    void recharge();
}
class LazyRobot implements Robots {
    public void performTask() {
        System.out.println("woking process is slow");
    }

    public void recharge() {
        System.out.println("Recharge the robot.");
    }
}
class SmartRobot implements Robots {
    public void performTask() {
        System.out.println("performance is good.");
    }

    public void recharge() {
        System.out.println("still recharging");
    }
}
public class Robot {
    public static void main(String[] args) {
        Robots[] bots = {new LazyRobot(), new SmartRobot()};
            for (Robots bot : bots) {
            bot.performTask();
            bot.recharge();
            System.out.println(" ");
        }
    }
}
    

