package JavaExamples;

public class Configuration {
    static String configvalue;
    static{
        configvalue="Default_config_value";
        System.out.println("static block executed.configvalue insilized");
    }
    
}
class  Name
{
    public static void main(String[] args) {
        System.out.println("configuration value "  +Configuration.configvalue );
    }
}
