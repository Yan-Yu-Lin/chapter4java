// Interface iVehicle
interface iVehicle {
    void vShow(); // Abstract method for iVehicle
}

// Interface iMaterial
interface iMaterial {
    void mShow(); // Abstract method for iMaterial
}

// Class Car implementing both iVehicle and iMaterial
class Car implements iVehicle, iMaterial {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("Produced car with number " + num + " and gas amount " + gas);
    }

    public void vShow() {
        System.out.println("The car number is " + num);
        System.out.println("The gas amount is " + gas);
    }

    public void mShow() {
        System.out.println("The material of the car is iron.");
    }
}

// Main class
public class Sample4_13 {
    public static void main(String[] args) {
        Car car1 = new Car(1234, 20.5);

        car1.vShow(); // Calls the method from iVehicle
        car1.mShow(); // Calls the method from iMaterial
    }
}
