package Cool.Operations.Switchstatements.Javainstanceoperator;
interface Vehicle {
    void start();
}
interface ElectricVehicle extends Vehicle {
    void charge();
}
class Tesla implements ElectricVehicle {
    public void start() {
        System.out.println("BMW is starting silently...");
    }

    public void charge() {
        System.out.println("BMW is charging...");
    }
    public static void main(String[] args) {
        Vehicle myVehicle = new Tesla(); 
        if (myVehicle instanceof Tesla) {
            System.out.println("myVehicle is a BMW");
            ((Tesla) myVehicle).start();
            ((Tesla) myVehicle).charge();
        }

        if (myVehicle instanceof ElectricVehicle) {
            System.out.println("myVehicle is an Electric Vehicle");
        }
        if (myVehicle instanceof Vehicle) {
            System.out.println("myVehicle is a general Vehicle");
        }

    }
}
    


