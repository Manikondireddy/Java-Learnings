package JavaExamples.Practice.tasks;

 class Bin {
    private int password =2345;
    public int getpwd()
    {
        return password;

    }
    public void setpwd(int password)
    {
        this.password = password;
    }
}
class Bank1
{
    public static void main(String[] args) {
        
        Bin atmcard = new Bin();
        int x= atmcard.getpwd();
        System.out.println(2345);
        System.out.println(atmcard.getpwd());

    }

}





    

