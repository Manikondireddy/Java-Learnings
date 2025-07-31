package practiceOops;

public class Enum {
enum Weather {
        SUNNY, CLOUDY, RAINY, STORMY
    }
public static void main(String[] args) {
        Weather currentWeather = Weather.RAINY;

        if (currentWeather == Weather.SUNNY) {
            System.out.println("It's a great day for a picnic");
        } else if (currentWeather == Weather.CLOUDY) {
            System.out.println("Might want to bring a Raincourt");
        } else if (currentWeather == Weather.RAINY) {
            System.out.println("Better grab an umbrella");
        } else if (currentWeather == Weather.STORMY) {
            System.out.println("Stay indoors and stay safe.");
        }
    }
}
    
