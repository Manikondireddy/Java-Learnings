package JavaExamples;

public class Random {
    {
        int c=20;

    }
    class Demo extends Random
    {
        void test()
        {
            System.out.println("hey its testing");
        }
    }
    class Mark
    {
        public static void main(String[] args) {
            Demo d1 = new Demo();
            System.out.println(d1.c);
            d1.test();
        }
    }

    }
    

