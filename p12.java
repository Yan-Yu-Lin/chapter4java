// Interface iVehicle
interface iVehicle {
    int weight = 1000; // Constant variable
    void show();       // Abstract method
}

// Class Car implementing iVehicle
class Car implements iVehicle {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("Produced car with number " + num + " and gas amount " + gas);
    }

    public void show() {
        System.out.println("The car number is " + num);
        System.out.println("The gas amount is " + gas);
    }
}

// Class Plane implementing iVehicle
class Plane implements iVehicle {
    private int flight;

    public Plane(int f) {
        flight = f;
        System.out.println("Produced plane with flight number " + flight);
    }

    public void show() {
        System.out.println("The flight number is " + flight);
    }
}

// Main class
public class Sample4_12 {
    public static void main(String[] args) {
        iVehicle[] ivc;
        ivc = new iVehicle[2]; // Array of iVehicle

        ivc[0] = new Car(1234, 20.5); // First object is a Car
        ivc[1] = new Plane(232);     // Second object is a Plane

        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show(); // Polymorphism: calls the appropriate show() method
        }
    }
}
