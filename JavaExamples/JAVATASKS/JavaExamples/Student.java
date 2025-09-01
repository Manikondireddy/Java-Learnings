package JavaExamples;

public class Student 
{
    int stdid;
    String stdname;
    char stdsec;
    Student(int a, String b, char c)
    {
       stdid=a;
        stdname=b;
        stdsec=c;
    }
        public static void main(String[] args)
        {
            Student std1=new Student(123,"mani",'A');
            System.out.println(std1.stdid);
            System.out.println(std1.stdname);
            System.out.println(std1.stdsec);
            Student std2=new Student(456,"Radha",'B');
            System.out.println(std2.stdid);
            System.out.println(std2.stdname);
            System.out.println(std2.stdsec);
        }
    }



    


