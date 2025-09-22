package JavaExamples.Wednesday.THURSDAy;

public class Configuration {
    static String configvalue;
    static
    {
        configvalue="default +value_980";
        System.out.println("static block created ");
        

    }
    public static void main(String[] args) {
        System.out.println("Configuration :" + Configuration.configvalue);
    }
    
}
