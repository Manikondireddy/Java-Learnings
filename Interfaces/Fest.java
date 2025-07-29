package Interfaces;
interface Fests {
    void turnOn();
    void turnOff();
}
class Drama implements Fests {
    public void turnOn() {
        System.out.println("Drama is good too see");
    }

    public void turnOff() {
        System.out.println("drama stories are more good to listen.");
    }
}
class Dramaday implements Fests {
    public void turnOn() {
        System.out.println("existed to see drama");
    }

    public void turnOff() {
        System.out.println("ending of drama is too good");
    }
}

 public class Fest {
    public static void main(String[] args) {
        Fests[] kitchen = {new Dramaday(), new Drama()};

        for (Fests appliance : kitchen) {
            System.out.println(" ");
            appliance.turnOn();
            appliance.turnOff();
            System.out.println("");
        }
    }
}
    

