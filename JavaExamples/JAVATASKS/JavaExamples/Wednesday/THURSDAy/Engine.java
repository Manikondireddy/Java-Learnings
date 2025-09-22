package JavaExamples.Wednesday.THURSDAy;

public interface  Engine {
    void start();
}
 interface  Motor {
    void stop();
}
class fruit implements Engine,Motor{
    @Override
    public void start()
    {
        System.out.println("fruits are good for health");
    }
    @Override
    public void stop()
    {
        System.out.println("dryfruits too good ");
    }
    public static void main(String[] args) {
        fruit v= new fruit();
        v.start();
        v.stop();
    }
}
    


    

