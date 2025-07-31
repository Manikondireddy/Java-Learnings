package practiceOops;
interface Workable {
    void doWork();
}
class Lazy implements Workable {
    private int excuseLevel = 0;

    public void doWork() {
        if (excuseLevel < 2) 
        {
            System.out.println(" you can runany way");
            excuseLevel++;
        } else
         {
            System.out.println("dont run");
        }
    }
}

public class Animations1 {
    public static void main(String[] args) {
        Lazy bot = new Lazy();

        for (int i = 0; i < 4; i++) {
            bot.doWork();
        }
    }
}