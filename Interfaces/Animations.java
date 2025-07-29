package Interfaces;

interface SmartFeatures {
    void showTime();

    default void healthTracking() {
        System.out.println("Tracking heart rate");
    }
}
class Device {
    void powerOn() {
        System.out.println("Device is powering on");
    }
}
class SmartWatch extends Device implements SmartFeatures {
    public void showTime() {
        System.out.println("It's  time to do");
    }
}
public class Animations {
    public static void main(String[] args) {
        SmartWatch myWatch = new SmartWatch();
        myWatch.powerOn();        
        myWatch.showTime();       
        myWatch.healthTracking();
    }
}
    
    

