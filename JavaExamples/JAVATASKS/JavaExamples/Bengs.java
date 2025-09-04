package JavaExamples;

public class Bengs {
   private String brand;
    private String  model;
    private int year;
public void start(String brand,String model,String year )
{
    this.brand=brand;
    this.brand=model;
    this.brand=year;

}
public void start()
{
        System.out.println(brand + " " + model + " (" + year + ") is starting");

}
public void stop()
{
           System.out.println(brand + " " + model + " (" + year + ") is starting...");

}
public String getbrand()
{
return brand;
}

public String getmodel()
{
    return model;
}
public int  getYear()
{
    return year;
}
class Cars23
{
    public static void main(String[] args) {
        Bengs c=new Bengs();
        c.start();
        c.stop();
    }

}
}


 

