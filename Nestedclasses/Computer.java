public class Computer {
    private String mood = "It's a new laptop";

    public void startDrama() {
        class RAM {
            void talk() {
                System.out.println("RAM");
            }
        }

        class CPU {
            void talk() {
                System.out.println("CPU");
            }
        }

        RAM ram = new RAM();
        CPU cpu = new CPU();

        System.out.println(" Computer Drama");
        ram.talk();
        cpu.talk();
        System.out.println("Computer: " + mood);
        System.out.println("Hard Drive");
    }

    public static void main(String[] args) {
        Computer myPC = new Computer();
        myPC.startDrama();
    }
}

    

