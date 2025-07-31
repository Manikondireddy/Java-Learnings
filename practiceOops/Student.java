package practiceOops;

public class Student {
    String name;
    int rollNumber;
    int age;
    public Student(String name, int rollNumber,int age)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
    }
        public String getName()
        { 
    
            return name;

        }
        public void setName(String name)
        {
            this.name=name;
        }
        public int getRollNumber()
        {
            return rollNumber ;
        }
        public void setrollNumber(int rollNumber){
            this.rollNumber = rollNumber;
        }
        public int getAge()
        {
            return age;

        }
        public void setAge(int age)
        {
            this.age=age;
        }
        public void displayInfo()
        {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Age: " + age);
        }
        public static void main(String[] args)
         {
            Student student1 = new Student("Mani",32,20);
            student1.displayInfo();

             System.out.println(student1.getAge()+ " " + student1.getRollNumber()+ " " +student1.getName());
            
        }



    }
    





