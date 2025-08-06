package JavaExamples.JAVATASKS;

public class Configuration {
    
    static String configValue;
    static {
    configValue = "DefaultConfig123";
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Configuration value  " );
    }
}
    

