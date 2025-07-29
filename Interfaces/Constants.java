package Interfaces;
interface Mission {
    int MAX_SPEED = 25;        
    int BATTERY_CAPACITY = 100; 
    String MISSION_NAME = "Mars";
}
class Space implements Mission {
    void displaySpecs() {
        System.out.println("Mission: " + MISSION_NAME);
        System.out.println(" Max Speed: " + MAX_SPEED + "");
        System.out.println(" Battery Capacity: " + BATTERY_CAPACITY + " ");
    }
}
public class Constants {
    public static void main(String[] args) {
        Space rover = new Space();
        rover.displaySpecs();
    }
}
    

